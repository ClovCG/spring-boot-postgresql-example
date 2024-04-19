package com.example.demoAPI.utils;

import com.example.demoAPI.api.model.User;

public class Utils {
    public static User handleUpdatedUser(User user, User userDetails) {
        if (userDetails.getUsername() != "" && userDetails.getUsername() != null) {
            user.setName(userDetails.getUsername());
        }
        if (userDetails.getAge() != 0) {
            user.setAge(userDetails.getAge());
        }

        return user;
    }
}
