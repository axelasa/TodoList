package com.axel.todolist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.axel.todolist.R
import com.axel.todolist.adapter.TodoListAdapter
import com.axel.todolist.classes.Todo
import kotlinx.android.synthetic.main.activity_main.*

class TodoList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf(Todo())

        val adapter = TodoListAdapter(todoList)
        view.adapter = adapter
        view.layoutManager = LinearLayoutManager(this)

        add.setOnClickListener {
            val title = editText.text.toString()
            val todo =Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size +1)
        }

//        delete.setOnClickListener {
//            deleteIt()

        }
    }
//    private fun deleteIt(){
//        val todo = Todo(title ="", isChecked = false)
//        if (Todo("",true).isChecked)
//            todo.removeItem(position:Int)
//        notifyItemRemoved(position)
//    }
    //}
//}