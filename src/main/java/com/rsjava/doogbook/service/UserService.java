package com.rsjava.doogbook.service;

import com.rsjava.doogbook.exception.InvalidPasswordFormatException;
import com.rsjava.doogbook.exception.InvalidUsernameFormatException;
import com.rsjava.doogbook.model.User;
import com.rsjava.doogbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        User userToAdd = new User();
        if(isCorrectUsernameFormat(user.getUsername())){
            userToAdd.setUsername(user.getUsername());
        } else {
            throw new InvalidUsernameFormatException(user.getUsername());
        }
        if (isCorrectPasswordFormat(user.getPassword())){
            userToAdd.setPassword(user.getPassword());
        } else {
            throw new InvalidPasswordFormatException(user.getPassword());
        }
        return userRepository.save(userToAdd);
    }

    private boolean isCorrectUsernameFormat(String username) {
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*\\w)(?!.*\\s)(?!.*\\!)(?!.*[\\{\\}]).{6,20}$");
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

    private boolean isCorrectPasswordFormat(String password) {
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*\\w).{6,20}$");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
