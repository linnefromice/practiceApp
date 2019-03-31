package jp.co.linnefromice.todolist01.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import jp.co.linnefromice.todolist01.model.Task;
import jp.co.linnefromice.todolist01.model.User;
import jp.co.linnefromice.todolist01.service.TaskService;
import jp.co.linnefromice.todolist01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private TaskService taskService;
    @Autowired
    private UserService userService;

    @RequestMapping("/th/home")
    public String home(Model model) {
        final List<User> users = userService.findAll();
        final List<Task> tasks = taskService.findAll();

        model.addAttribute("users", users);
        model.addAttribute("tasks", tasks);

        return "th/home";
    }
}
