package com.tasks.repository;

import com.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by HP on 12/19/2017.
 */
public interface TaskRepository  extends CrudRepository<Task, Long> {



}