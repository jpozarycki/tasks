package com.pozarycki.tasks.service;

import com.pozarycki.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> listTasks();
}
