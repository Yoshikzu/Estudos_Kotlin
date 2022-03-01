package br.com.kotlin.todolist.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.kotlin.todolist.R
import br.com.kotlin.todolist.databinding.ActivityMainBinding
import br.com.kotlin.todolist.datasource.TaskDataSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter by lazy {TaskListAdapter()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.rvTasks.adapter = adapter
        updateList()
        insertListeners()
    }

    private fun insertListeners(){
        binding.floatingActionButton.setOnClickListener {
            startActivityForResult(Intent(this,AddTaskActivity::class.java),CREATE_NEW_TASK)
        }
        adapter.listenerEdit = {

        }

        adapter.listenerDelete = {

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestcode == CREATE_NEW_TASK && resultCode == Activity.RESULT_OK){
            updateList()
        }
    }

    private fun updateList(){
        adapter.submitList(TaskDataSource.getList())
    }

    companion object{
        private const val CREATE_NEW_TASK = 1000
    }
}