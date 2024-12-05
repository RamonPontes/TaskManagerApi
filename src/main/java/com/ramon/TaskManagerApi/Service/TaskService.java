package com.ramon.TaskManagerApi.Service;

import com.ramon.TaskManagerApi.Model.Tasks;
import com.ramon.TaskManagerApi.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Tasks> getAllTasks(){
        return taskRepository.findAll();
    }
}
