package classes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.observers.DisposableSingleObserver
import io.reactivex.rxjava3.schedulers.Schedulers

class APIViewModel: ViewModel() {

    val data = MutableLiveData<List<Data>>()
    val error = MutableLiveData<Boolean>()
    val loading= MutableLiveData<Boolean>()

    private val apiService=APIService()
    private val disposable=CompositeDisposable()

    fun refreshdata(){
        getfrominternet()
    }

    private fun getfrominternet(){
        loading.value=true
        disposable.add(
            apiService.getData().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object :DisposableSingleObserver<List<Data>>(){
                    override fun onSuccess(t: List<Data>) {
                        data.value=t
                        error.value=false
                        loading.value=false

                    }

                    override fun onError(e: Throwable) {
                        error.value=true
                        loading.value=true
                    }

                })

        )
    }


}