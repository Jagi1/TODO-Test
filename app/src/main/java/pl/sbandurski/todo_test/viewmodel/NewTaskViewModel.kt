package pl.sbandurski.todo_test.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import pl.sbandurski.todo_test.adapter.TasksAdapter
import pl.sbandurski.todo_test.model.Task

class NewTaskViewModel: BaseObservable() {

    private var adapter: TasksAdapter = TasksAdapter()
    private var data : ArrayList<Task> = arrayListOf()

    init {
        populateRecycler()
    }

    @Bindable
    fun getData(): List<Task> = data

    @Bindable
    fun getAdapter(): TasksAdapter = adapter

    fun populateRecycler() {
        data.add(Task(name = "a", date = "2020", type = "WORK"))
        notifyPropertyChanged(BR.data)
    }
}