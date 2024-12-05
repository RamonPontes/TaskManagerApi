package com.ramon.TaskManagerApi.Repository;

import com.ramon.TaskManagerApi.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> { }
