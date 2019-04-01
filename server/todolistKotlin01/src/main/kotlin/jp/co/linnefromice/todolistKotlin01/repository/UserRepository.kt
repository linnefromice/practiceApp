package jp.co.linnefromice.todolistKotlin01.repository

import jp.co.linnefromice.todolistKotlin01.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, String> {
}