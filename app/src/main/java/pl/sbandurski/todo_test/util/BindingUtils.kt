package pl.sbandurski.todo_test.util

import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import pl.sbandurski.todo_test.adapter.TasksAdapter
import pl.sbandurski.todo_test.model.Task

@BindingAdapter("app:adapter", "app:data")
fun bind(recyclerView: RecyclerView, adapter: TasksAdapter, data: List<Task>) {
    recyclerView.adapter = adapter
    adapter.updateData(data)
}