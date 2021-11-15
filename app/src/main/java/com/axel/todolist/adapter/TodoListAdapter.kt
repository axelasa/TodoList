package com.axel.todolist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.axel.todolist.R
import com.axel.todolist.classes.Todo
import kotlinx.android.synthetic.main.item_todo.view.*

class TodoListAdapter(var todos:List<Todo>):RecyclerView.Adapter<TodoListAdapter.TodoViewHolder>() {

  inner class TodoViewHolder( itemView: View): RecyclerView.ViewHolder(itemView)

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

    val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
    return TodoViewHolder(view)

  }

  override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

    holder.itemView.apply {
      tvTitle.text = todos[position].title
      checkbox.isChecked = todos[position].isChecked == true
    }
  }

  override fun getItemCount(): Int {

    return todos.size
  }


}