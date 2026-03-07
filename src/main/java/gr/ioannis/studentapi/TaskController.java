package gr.ioannis.studentapi;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;

@RestController
public class TaskController {

    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return List.of(
                new Task(1L, "Learn Spring Boot", false),
                new Task(2L, "Build first API", true),
                new Task(3L, "Push project to GitHub", false)
        );
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable Long id) {

        List<Task> tasks = List.of(
                new Task(1L, "Learn Spring Boot", false),
                new Task(2L, "Build first API", true),
                new Task(3L, "Push project to GitHub", false)
        );

        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }

        return null;
    }

    @PostMapping("/tasks")
    public Task createTask(@RequestBody Task task) {
        return task;
    }
    @DeleteMapping("/tasks/{id}")
    public String deleteTask(@PathVariable Long id) {
        return "Task with id " + id + " deleted";
    }
    @PutMapping("/tasks/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        task.setId(id);
        return task;
    }
}