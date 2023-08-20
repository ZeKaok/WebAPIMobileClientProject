package classes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class APIViewModel: ViewModel() {

    val data = MutableLiveData<List<Data>>()
    val error = MutableLiveData<Boolean>()
    val loading= MutableLiveData<Boolean>()

    private val apiService=APIService()

    fun refreshdata(){

    }


}