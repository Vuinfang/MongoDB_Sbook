package com.yunfang.secondbook.controler;

import com.yunfang.secondbook.entity.User;
import com.yunfang.secondbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserHandler {
    private final UserRepository userRepository;


    public UserHandler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/save")
    public String save(@RequestBody User user){
        User result = userRepository.save(user);
        if (result != null) {
            return user.getUsername();
        } else {
            return "error";
        }
    }
}
