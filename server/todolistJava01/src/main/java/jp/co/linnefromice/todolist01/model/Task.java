package jp.co.linnefromice.todolist01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    private Integer id;

    private String user_id;

    private String task_title;

    private String task_description;

    private Boolean completed;

    private Date registered_date;

}
