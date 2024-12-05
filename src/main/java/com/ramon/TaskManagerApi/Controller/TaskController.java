package com.ramon.TaskManagerApi.Controller;

import com.ramon.TaskManagerApi.Model.Tasks;
import com.ramon.TaskManagerApi.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Tasks>> getAllTasks() {
        return ResponseEntity.status(200).body(taskService.getAllTasks());
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
