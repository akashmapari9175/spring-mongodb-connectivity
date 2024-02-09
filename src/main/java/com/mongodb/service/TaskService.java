package com.mongodb.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.model.Task;
import com.mongodb.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	
	//Crud create read update delete 
	
	
	public String wellcome()
	{	
		return "wellcome here ";
	}
	
	//create task 
	public Task saveTask(Task task) {
		task.setTackId(UUID.randomUUID().toString().split("-")[0]); //this give alpha numeric values
		Task tasksave = taskRepository.save(task);
		return tasksave;
	}
	
	
	//read all task 
	public List<Task> getAllTask(){
		//List<Task> findAll = taskRepository.findAll();  we can direct return the object
		return taskRepository.findAll();
	}
	
	//find by id 
	public Task getTaskById(String taskId) {
		return taskRepository.findById(taskId).get();  //this is an given optional that why we convert the object with get()
	}
	
	
	//delete task by id 
	public String deleteTaskById(String taskId) {
		taskRepository.deleteById(taskId);
		return taskId+"task deleted from mongoDb";
	}
	
	//update id 
	public Task updateTaskById(String taskId, Task task) {
		Task taskold = taskRepository.findById(taskId).get();
		taskold.setTackId(taskId);
		taskold.setAssignee(task.getAssignee());
		taskold.setDescription(task.getDescription());
		taskold.setSeverity(task.getSeverity());
		taskold.setStoryPoint(task.getStoryPoint());
		Task saveOldTask = taskRepository.save(taskold);
		return saveOldTask;
	}
	/*
	 * public List<Task> severity(int id){ List<Task> list =
	 * taskRepository.findBySeverity(id); return list; }
	 */
//
//	public Task getTaskById(String id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	

	public List<Task> severityFind(int severity) {
		List<Task> list = taskRepository.findBySeverity(severity);
		return list;
	}

	
	
	
	
	
	
	
}
