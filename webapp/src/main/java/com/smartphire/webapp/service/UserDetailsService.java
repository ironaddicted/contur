package com.smartphire.webapp.service;

import com.smartphire.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by avoinovan on 10/28/16
 */
@Service
public class UserDetailsService {

    UserRepository userRepository;

    @Autowired
    public UserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
