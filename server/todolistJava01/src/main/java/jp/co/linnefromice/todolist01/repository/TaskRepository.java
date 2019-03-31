package jp.co.linnefromice.todolist01.repository;

import jp.co.linnefromice.todolist01.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, String> {
}
