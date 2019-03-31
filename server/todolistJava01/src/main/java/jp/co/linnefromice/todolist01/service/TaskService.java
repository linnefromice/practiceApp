package jp.co.linnefromice.todolist01.service;

import jp.co.linnefromice.todolist01.model.Task;
import jp.co.linnefromice.todolist01.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Optional<Task> findOne(final String id) {
        return repository.findById(id);
    }

    public List<Task> findAll() {
        return repository.findAll();
    }

    public Task save(Task task) {
        return repository.save(task);
    }
}
