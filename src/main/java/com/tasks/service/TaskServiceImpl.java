package com.tasks.service;

import com.tasks.domain.Task;
import com.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;

/**
 * Created by HP on 12/19/2017.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }
}
