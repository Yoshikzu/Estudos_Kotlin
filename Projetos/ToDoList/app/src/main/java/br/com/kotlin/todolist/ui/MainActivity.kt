package br.com.kotlin.todolist.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import br.com.kotlin.todolist.R
import br.com.kotlin.todolist.databinding.ActivityMainBinding
import br.com.kotlin.todolist.datasource.TaskDataSource

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val adapter by lazy {TaskListAdapter()}

    private val startForResult = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    )
    { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            updateList()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvTasks.adapter = adapter
        updateList()
        insertListeners()
        //DATA SOURCE
        //ROOM
    }

    private fun insertListeners(){
        binding.includeTask.setOnClickListener {
            val createTaskIntent = Intent(this, AddTaskActivity::class.java)
            startForResult.launch(createTaskIntent)
        }
        adapter.listenerEdit = {
            val intent = Intent(this,AddTaskActivity::class.java)
            intent.putExtra(AddTaskActivity.TASK_ID,it.id)
            //startActivityForResult(intent,CREATE_NEW_TASK)
            startForResult.launch(intent)
        }

        adapter.listenerDelete = {
            TaskDataSource.deleteTask(it)
            updateList()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == CREATE_NEW_TASK && resultCode == Activity.RESULT_OK){
            updateList()
        }
    }

    private fun updateList(){
        val list = TaskDataSource.getList()
        binding.includeEmpty.emptyState.visibility = if (list.isEmpty()){
            View.VISIBLE
        }else{
            View.GONE
        }
        adapter.submitList(list)
    }

    companion object{
        private const val CREATE_NEW_TASK = 1000
    }
}