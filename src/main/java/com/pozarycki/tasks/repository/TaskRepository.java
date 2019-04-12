package com.pozarycki.tasks.repository;

import com.pozarycki.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {
}
