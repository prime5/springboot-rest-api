package com.example.taskapi.controller;

import com.example.taskapi.model.Task;
import com.example.taskapi.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskRepository repo;

    public TaskController(TaskRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Task> getTasks() {
        return repo.findAll();
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = repo.save(task);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdTask);  // returns 201 Created
    }
    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task taskDetails) {
        return repo.findById(id)
                .map(task -> {
                    task.setTitle(taskDetails.getTitle());
                    task.setDescription(taskDetails.getDescription());
                    Task updatedTask = repo.save(task);
                    return ResponseEntity.ok(updatedTask);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        return repo.findById(id)
                .map(task -> {
                    repo.delete(task);
                    ResponseEntity<Void> response = ResponseEntity.noContent().build();
                    return response;
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}

