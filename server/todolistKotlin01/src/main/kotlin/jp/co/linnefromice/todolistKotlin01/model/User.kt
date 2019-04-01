package jp.co.linnefromice.todolistKotlin01.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table
class User {

    @Id
    val id : String = String()
    val name : String = String()
    val password : String = String()
}