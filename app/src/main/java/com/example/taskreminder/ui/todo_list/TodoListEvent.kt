package com.example.taskreminder.ui.todo_list

import com.example.taskreminder.data.Todo

sealed class TodoListEvent {
    data class OnTodoClick(val todo: Todo): TodoListEvent()
    data class OnDeleteTodoClick(val todo: Todo): TodoListEvent()
    object OnUndoDeleteClick: TodoListEvent()
    object OnAddEditTodoClick: TodoListEvent()
    data class OnDoneChange(val todo: Todo, val isDone: Boolean): TodoListEvent()
}
