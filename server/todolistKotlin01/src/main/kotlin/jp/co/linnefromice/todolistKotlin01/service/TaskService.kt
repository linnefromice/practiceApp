package jp.co.linnefromice.todolistKotlin01.service

import jp.co.linnefromice.todolistKotlin01.model.Task
import jp.co.linnefromice.todolistKotlin01.repository.TaskRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class TaskService (
    private val taskRepository: TaskRepository){

    fun findOne(id: String): Optional<Task> {
        return taskRepository.findById(id);
    }

    fun findAll(): List<Task> {
        return taskRepository.findAll();
    }

    fun save(task: Task): Task {
        return taskRepository.save(task);
    }
}