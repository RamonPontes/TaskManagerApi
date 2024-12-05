package com.ramon.TaskManagerApi.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @GetMapping
    public ResponseEntity<String> getAllTasks() {
        return ResponseEntity.status(200).body("Ok");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getTaskById() {
        return ResponseEntity.status(200).body("Ok");
    }

    @PostMapping
    public ResponseEntity<String> createdTask() {
        return ResponseEntity.status(200).body("Ok");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> editTask() {
        return ResponseEntity.status(200).body("Ok");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask() {
        return ResponseEntity.status(200).body("Ok");
    }

}
