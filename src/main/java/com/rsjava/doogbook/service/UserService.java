package com.rsjava.doogbook.service;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.rsjava.doogbook.exception.InvalidUsernameFormatException;
import com.rsjava.doogbook.model.User;
import com.rsjava.doogbook.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
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

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User addUser(User user){
        if (isCorrectUsernameFormat(user.getUsername())) {
            return userRepository.save(user);
        }
        throw new InvalidUsernameFormatException(user.getUsername());
    }

   private boolean isCorrectUsernameFormat(String username){
        Pattern pattern = Pattern.compile("^(?=.*\\d)(?=.*\\w)(?!.*\\s)(?!.*\\!)(?!.*[\\{\\}]).{6,20}$");
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }

}
