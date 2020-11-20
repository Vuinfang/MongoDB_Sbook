package com.yunfang.secondbook.repository;

import com.yunfang.secondbook.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void save(){
        User a = new User(null, "aaa", "123", "aa@gmail.com", "4564657","123134");
        System.out.println(userRepository.save(a));
    }
}