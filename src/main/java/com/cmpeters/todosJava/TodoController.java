package com.cmpeters.todosJava;


import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    public TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService){
        this.todoService = todoService;
    }

    @GetMapping
    public ArrayList<TodoTask> displayTodos(){
        return todoService.displayTodoList();
    }

    @PostMapping(value = "/{taskName}")
    public ArrayList<TodoTask> addNewTodo(@PathVariable String taskName){
        return todoService.addNewTodo(taskName);
    }

    @GetMapping(value="/{taskId}")
    public List<TodoTask> findTaskById(@PathVariable int taskId){
        return todoService.findToDoById(taskId);
    }

    @PutMapping(value="/{taskId}")
    public TodoTask updatedCompleted(@PathVariable int taskId){
        return todoService.updateCompleted(taskId);
    }

//    @GetMapping("/{id}")
//    public TodoService findPathById(@PathVariable int id){
//        TodoService findTask = new TodoService();
//        findTask.findTaskById(id);
//        return findTask;
//    }

}
