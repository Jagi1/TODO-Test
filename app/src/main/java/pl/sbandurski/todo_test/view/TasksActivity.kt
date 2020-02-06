package pl.sbandurski.todo_test.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import pl.sbandurski.todo_test.R
import pl.sbandurski.todo_test.adapter.TasksAdapter
import pl.sbandurski.todo_test.databinding.ActivityMainBinding
import pl.sbandurski.todo_test.model.Task
import pl.sbandurski.todo_test.viewmodel.NewTaskViewModel

class TasksActivity : AppCompatActivity() {

  lateinit var binding: ActivityMainBinding
  lateinit var viewModel: NewTaskViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    viewModel = ViewModelProviders.of(this).get(NewTaskViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.viewModel = viewModel
    binding.lifecycleOwner = this
    setupRecyclerView()

  }

  fun setupRecyclerView() {
//    val recyclerView = binding.tasksRecycler
//    val layoutManager = LinearLayoutManager(this)
//    recyclerView.layoutManager = layoutManager
//
//    val tasks = emptyList<Task>()
//    val adapter = TasksAdapter(tasks)
//    recyclerView.adapter = adapter
  }
}
