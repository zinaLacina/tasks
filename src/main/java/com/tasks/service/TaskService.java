package com.tasks.service;

import com.tasks.domain.Task;

/**
 * Created by HP on 12/19/2017.
 */
public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
