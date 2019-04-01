package jp.co.linnefromice.todolistKotlin01.repository

import jp.co.linnefromice.todolistKotlin01.model.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<Task, String> {
}