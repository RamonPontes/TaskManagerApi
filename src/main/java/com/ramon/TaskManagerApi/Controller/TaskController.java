package com.ramon.TaskManagerApi.Controller;

import com.ramon.TaskManagerApi.Model.Tasks;
import com.ramon.TaskManagerApi.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<?> getTaskById(@PathVariable int id) {

        if (id <= 0) {
            return ResponseEntity.status(400).body("Invalid ID");
        }

        Optional<Tasks> task = taskService.getTaskById(id);

        if (task.isEmpty()) {
            return ResponseEntity.status(404).body("Task not found");
        } else {
            return ResponseEntity.status(200).body(task);
        }
    }

    @PostMapping
    public ResponseEntity<?> createdTask(@RequestBody Tasks task) {

        if (task.isAnyFieldNull()) { return ResponseEntity.status(400).body("All fields are required"); }

        Tasks newTask = taskService.createdTask(task);

        return ResponseEntity.status(200).body(newTask);
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
