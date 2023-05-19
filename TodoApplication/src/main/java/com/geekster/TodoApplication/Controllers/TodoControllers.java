package com.geekster.TodoApplication.Controllers;

import com.geekster.TodoApplication.Models.Todo;
import com.geekster.TodoApplication.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Validated
@RestController
public class TodoControllers {
    @Autowired
    TodoService todoService;
    @GetMapping(value="/getAllTodos")
    public List<Todo> geAllTodos(){
        return todoService.getAllTodos();
    }
    @GetMapping(value = "/getTodosByStatus")
    public List<Todo>getTodoByStatus(@RequestParam String status){
        return todoService.getTodosByUserStatus(status);
    }

    @RequestMapping(value = "/getTodoById/{id}",method = RequestMethod.GET)
    public Todo getTodoById(@PathVariable String id)
    {
        return todoService.getTodoBasedOnId(id);
    }
    @PostMapping(value = "/addTodo")
    public String addTodo(@RequestBody Todo todo){
        return todoService.addMyTodo(todo);
    }
    @DeleteMapping(value = "/deleteTodoById/{id}")
        public String deleteTodoById(@PathVariable String id){
            return todoService.removeTodoById(id);
        }
        @PutMapping(value = "/updateTodoById/{id}/{status}")
    public String updateTodoStatusById(@PathVariable String id,@PathVariable String status){
        return todoService.updateTodoStatusById(id,status);
        }

}
