package jp.co.linnefromice.todolist01.repository;

import jp.co.linnefromice.todolist01.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
