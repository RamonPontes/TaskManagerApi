package com.ramon.TaskManagerApi.Repository;

import com.ramon.TaskManagerApi.Model.tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<tasks, Integer> { }
