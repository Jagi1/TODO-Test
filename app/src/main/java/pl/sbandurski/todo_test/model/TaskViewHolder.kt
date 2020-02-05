package pl.sbandurski.todo_test.model

import androidx.recyclerview.widget.RecyclerView
import pl.sbandurski.todo_test.databinding.ItemTaskBinding

class TaskViewHolder(val binding: ItemTaskBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(task: Task) {
        binding.task = task
        binding.executePendingBindings()
    }

}