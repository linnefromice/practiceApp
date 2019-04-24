package jp.co.linnefromice.todolist01.gateway.restapi;

import jp.co.linnefromice.todolist01.model.User;
import jp.co.linnefromice.todolist01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gateway/restapi/users")
public class UserRestApiController {

    @Autowired
    private UserService userService;

    @GetMapping(path="findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
