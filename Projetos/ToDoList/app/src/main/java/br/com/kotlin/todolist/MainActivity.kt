package br.com.kotlin.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.kotlin.todolist.databinding.ActivityMainBinding
import br.com.kotlin.todolist.ui.AddTaskActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        insertListeners()
    }

    private fun insertListeners(){
        binding.floatingActionButton.setOnClickListener {
            startActivity(Intent(this,AddTaskActivity::class.java))
        }
    }

}