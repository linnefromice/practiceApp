package jp.co.linnefromice.todolist01.gateway.restapi;

import jp.co.linnefromice.todolist01.model.Task;
import jp.co.linnefromice.todolist01.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gateway/restapi/tasks")
public class TaskRestApiController {

    @Autowired
    private TaskService taskService;

    @GetMapping(path="findAll")
    public List<Task> findAll() {
        return taskService.findAll();
    }
}
