package jp.co.linnefromice.todolistKotlin01.gateway.restapi

import jp.co.linnefromice.todolistKotlin01.model.Task
import jp.co.linnefromice.todolistKotlin01.service.TaskService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/gateway/restapi/tasks")
class TaskRestApiController(
    val service: TaskService) {

    @GetMapping(path= ["findAll"])
    fun findAll(): List<Task> {
        return service.findAll();
    }
}