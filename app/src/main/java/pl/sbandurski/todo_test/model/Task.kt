package pl.sbandurski.todo_test.model

import android.os.Parcelable

data class Task(
    private val name: String,
    private val date: String,
    private val type: String
) {
    fun getName(): String = name
    fun getDate(): String = date
    fun getType(): String = type
}