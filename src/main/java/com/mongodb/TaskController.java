package com.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.model.Task;
import com.mongodb.service.TaskService;

@RestController
//@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService service;
	
	@GetMapping("/wellcome")
	public String wellcome()
	{	
		return "wellcome here ";
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
		return service.saveTask(task);
	}
	
	@GetMapping("/alltasks")
	public List<Task> getTasks(){
		System.out.println("you can chenge the url");
		return service.getAllTask();
	}
	
	@GetMapping("/{taskId}")  // always the start with 
	public Task taskById(@PathVariable String taskId) {
		Task taskById = service.getTaskById(taskId);
		return taskById;
	}
	
	@PutMapping("/{taskId}")
	public Task updateTaskById(@RequestBody  Task task, @PathVariable String taskId) {
		Task updateTaskById = service.updateTaskById(taskId, task);
		return updateTaskById;
	}
	
	@DeleteMapping("/{taskId}")
	public String deleteTaskById(@PathVariable String taskId) {
		String deleteTaskById = service.deleteTaskById(taskId);
		return deleteTaskById;
	}
	@GetMapping("sev/{severity}")
	public List<Task> severity(@PathVariable int severity){
		List<Task> severity2 = service.severityFind(severity);
		return severity2;
	}
	
	
	
	
}
