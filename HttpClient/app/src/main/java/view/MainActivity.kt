package view

import Adapter.RecyclerviewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.httpclient.R
import com.example.httpclient.databinding.ActivityMainBinding
import model.Data

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var list: List<Data>
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: RecyclerviewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerview.setHasFixedSize(true)
        adapter=RecyclerviewAdapter(list)
        binding.recyclerview.adapter= adapter
        binding.recyclerview.layoutManager=LinearLayoutManager(this)

    }

}