package com.example.sample.repository;

import com.example.sample.modal.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
//    ArrayList<User> findAllUser();
}
