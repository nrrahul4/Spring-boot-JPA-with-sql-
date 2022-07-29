package com.example.sample.service;

import com.example.sample.modal.Login;
import com.example.sample.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginRepository loginRepository;

    @Override
    public ArrayList<Login> findAllUser() {
        return (ArrayList<Login>) loginRepository.findAll();
    }

    @Override
    public Login findUserByID(long Id) {
        Optional<Login> user=  loginRepository.findById(Id);
        if(user.isPresent()) {
            return user.get();
        }
        return null;
    }

    @Override
    public void addUser(ArrayList<Login> users) {
        for(Login use: users) {
            loginRepository.save(use);
        }

    }

    @Override
    public void deleteAllData() {
        loginRepository.deleteAll();
    }

    @Override
    public void deleteUserById(long id) {
        loginRepository.deleteById(id);
    }
}
