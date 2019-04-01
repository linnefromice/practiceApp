package jp.co.linnefromice.todolistKotlin01.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import java.util.Date

@Entity
@Table
class Task {

    @Id
    val id : String = String()
    val user_id : String = String()
    val task_title : String = String()
    val task_description : String = String()
    val completed : Boolean = false
    val registered_date : Date? = null
}