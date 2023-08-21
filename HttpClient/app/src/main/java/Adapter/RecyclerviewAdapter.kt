package Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.httpclient.R
import com.example.httpclient.databinding.ItemBinding

class RecyclerviewAdapter:RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>() {
    class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)
    

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view= DataBindingUtil.inflate<ItemBinding>(inflater, R.layout.item,parent,false)
            return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}