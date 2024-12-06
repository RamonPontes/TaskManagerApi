package com.ramon.TaskManagerApi.Service;

import com.ramon.TaskManagerApi.Model.Tasks;
import com.ramon.TaskManagerApi.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Tasks> getAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<Tasks> getTaskById(int id) {
        return taskRepository.findById(id);
    }

    public Tasks createdTask(Tasks task) {
        return taskRepository.save(task);
    }
}
