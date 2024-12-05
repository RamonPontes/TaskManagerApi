package com.ramon.TaskManagerApi.Repository;

import com.ramon.TaskManagerApi.Model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks, Integer> { }
