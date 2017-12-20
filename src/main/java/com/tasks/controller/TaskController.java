package com.tasks.controller;

import com.tasks.domain.Task;
import com.tasks.service.TaskService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by HP on 12/19/2017.
 */

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping( value = {"", "/"})
    public Iterable<Task> list() {
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task) {
        return this.taskService.save(task);
    }
}
