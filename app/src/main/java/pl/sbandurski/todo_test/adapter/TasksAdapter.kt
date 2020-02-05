package pl.sbandurski.todo_test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import pl.sbandurski.todo_test.databinding.ItemTaskBinding
import pl.sbandurski.todo_test.model.Task
import pl.sbandurski.todo_test.model.TaskViewHolder

class TasksAdapter(var taskList: List<Task> = emptyList()): RecyclerView.Adapter<TaskViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemBinding = ItemTaskBinding.inflate(layoutInflater, parent, false)
        return TaskViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = taskList.size

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.bind(task)
    }

    fun updateData(data: List<Task>) {
        taskList = data
        notifyDataSetChanged()
    }
}