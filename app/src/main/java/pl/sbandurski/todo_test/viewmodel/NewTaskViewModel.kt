package pl.sbandurski.todo_test.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.databinding.library.baseAdapters.BR
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import pl.sbandurski.todo_test.adapter.TasksAdapter
import pl.sbandurski.todo_test.model.Task

class NewTaskViewModel: ViewModel(), Observable {

    private val callbacks: PropertyChangeRegistry = PropertyChangeRegistry()

    private var adapter = MutableLiveData<TasksAdapter>().default(TasksAdapter())
    private var data = MutableLiveData<ArrayList<Task>>().default(arrayListOf())

    init {
        adapter.value = TasksAdapter()
        data.value = arrayListOf()
    }

    @Bindable
    fun getData(): ArrayList<Task> = data.value ?: arrayListOf()

    @Bindable
    fun getAdapter(): TasksAdapter = adapter.value ?: TasksAdapter()

    fun populateRecycler() {
        data.value?.add(Task(name = "a", date = "2020", type = "WORK"))
        notifyPropertyChanged(BR.data)
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.remove(callback)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        callbacks.add(callback)
    }

    fun notifyPropertyChanged(fieldId: Int) {
        callbacks.notifyCallbacks(this, fieldId, null)
    }

    fun<T: Any?> MutableLiveData<T>.default(initialValue: T) = apply { value = initialValue }

}