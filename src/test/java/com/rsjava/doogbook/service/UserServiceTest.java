package com.rsjava.doogbook.service;

import com.rsjava.doogbook.model.User;
import com.rsjava.doogbook.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
class UserServiceTest {
//
//    @Mock
//    UserRepository userRepository;
//
//    @InjectMocks
//    private UserService userService;
//
//    @BeforeEach
//    void setUp() {
//        when(userRepository.findAll()).thenReturn(prepareMockData());
//    }
//
//
//    @Test
//    void shouldAddNewUser() {
//        //given
//        List<User> allUsers = userService.getAllUsers();
//
//        //when
//        userService.addUser(new User(2,"username456", "password852"));
//
//        //then
//        assertThat(allUsers).hasSize(1).isNotNull();
//    }
//
//    private List<User> prepareMockData(){
//        List<User> userList = new ArrayList<>();
//        userList.add(new User(5, "aaaaaaaaaaaa123", "bbbbbbbbbbbbb2222"));
//        return userList;
//    }

}