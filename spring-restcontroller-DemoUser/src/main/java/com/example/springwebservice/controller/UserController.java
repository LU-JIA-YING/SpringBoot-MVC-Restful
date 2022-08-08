package com.example.springwebservice.controller;

import com.example.springwebservice.model.User;
import com.example.springwebservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping() //取得所有使用者
    public List<User> getAllUsers() {
        List<User> userList = this.userService.getAllUsers();
        return userList;
    }

    @GetMapping("/{id}") //取得某位使用者
    public User getUser(@PathVariable int id) {
        User user = this.userService.getUser(id);
        return user;
    }

    @PostMapping() //新增資料
    public User createUser(@RequestBody User user) {
        User createdUser = this.userService.createUser(user);
        return createdUser;
    }

    @PutMapping("/{id}") //修改已存在資料
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        User updatedUser = this.userService.updateUser(id, user);
        return updatedUser;
    }

    @DeleteMapping("/{id}") //刪除某筆資料
    public User deleteUser(@PathVariable int id) {
        User deletedUser = this.userService.deleteUser(id);
        return deletedUser;
    }
} // Class end
