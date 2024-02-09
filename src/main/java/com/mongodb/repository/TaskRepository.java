package com.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {

	//List<Task> findAll();

	Task save(Task task);

	List<Task> findAll();

	//List<Task> findBySeverity(int id);

	List<Task> findBySeverity(int severity);

}
