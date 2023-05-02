package com.pilalab.back.repository;

import com.pilalab.back.entity.User;
import com.pilalab.back.service.MainRepository;
import com.pilalab.back.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getAllUsers() {
        System.out.println("userRepository: " + userRepository);
        return userRepository.findAll();
    }

    public void createUser(User user) {
//        System.out.println("user:" + user.getUserId());
        userRepository.save(user);
    }


}

