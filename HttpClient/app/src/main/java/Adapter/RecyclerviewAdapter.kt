package Adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.httpclient.databinding.ItemBinding

class RecyclerviewAdapter:RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>() {
    inner class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root)
    

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}