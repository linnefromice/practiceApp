package jp.co.linnefromice.todolistKotlin01.service

import jp.co.linnefromice.todolistKotlin01.model.Task
import jp.co.linnefromice.todolistKotlin01.model.User
import jp.co.linnefromice.todolistKotlin01.repository.TaskRepository
import jp.co.linnefromice.todolistKotlin01.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService (
    private val userRepository: UserRepository){

    fun findOne(id: String): Optional<User> {
        return userRepository.findById(id);
    }

    fun findAll(): List<User> {
        return userRepository.findAll();
    }

    fun save(user: User): User {
        return userRepository.save(user);
    }
}