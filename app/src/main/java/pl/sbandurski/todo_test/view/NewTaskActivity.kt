package pl.sbandurski.todo_test.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pl.sbandurski.todo_test.R

class NewTaskActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_new_task)
  }
}
