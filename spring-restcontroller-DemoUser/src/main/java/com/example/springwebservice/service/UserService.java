package com.example.springwebservice.service;

import com.example.springwebservice.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        this.userList = new ArrayList<>();
        this.userList.add(new User(1, "Joe", 20));
        this.userList.add(new User(2, "Bill", 55));
        this.userList.add(new User(3, "Maggie", 38));
    }

    public List<User> getAllUsers() {
        return this.userList;
    }

    public User getUser(int id) {
        for (User user : this.userList) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }

    public User createUser(User user) {
        this.userList.add(user);
        return user;
    }

    public User updateUser(int id, User user) {
        for (User updatedUser : this.userList) {
            if (id == updatedUser.getId()) {
                updatedUser.setAge(user.getAge());
                updatedUser.setName(user.getName());
                return updatedUser;
            }
        }
        return null;
    }

    public User deleteUser(int id) {
        for (User user : this.userList) {
            if (id == user.getId()) {
                this.userList.remove(user);
                return user;
            }
        }
        return null;
    }

} // Class end
