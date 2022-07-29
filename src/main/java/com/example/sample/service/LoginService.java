package com.example.sample.service;

import com.example.sample.modal.Login;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public interface LoginService {
    ArrayList<Login> findAllUser();

    Login findUserByID(long Id);
    void addUser(ArrayList<Login> users);
    void deleteAllData();
    void deleteUserById(long id);
}
