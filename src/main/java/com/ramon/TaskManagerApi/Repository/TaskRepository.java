package com.ramon.TaskManagerApi.Repository;

import com.ramon.TaskManagerApi.Model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Tasks, Integer> {
    List<Tasks> getTasksByStatus(String status);
}
