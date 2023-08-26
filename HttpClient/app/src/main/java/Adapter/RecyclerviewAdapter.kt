package Adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.httpclient.R
import com.example.httpclient.databinding.ItemBinding
import model.Data

class RecyclerviewAdapter(val Data:List<Data>):RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return Data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.date.text=Data[position].date.toString()
        holder.binding.summary.text=Data[position].date.toString()
        holder.binding.temperaturec.text=Data[position].date.toString()
        holder.binding.temperaturef.text=Data[position].date.toString()
    }
}