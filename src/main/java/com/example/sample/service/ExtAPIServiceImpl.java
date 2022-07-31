package com.example.sample.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExtAPIServiceImpl implements ExtAPIService{
    @Override
    public String findUsersByCallingExtAPI() {
        RestTemplate restTemplate = new RestTemplate();
        String APIUri = "https://dummy.restapiexample.com/api/v1/employees";
        String result = restTemplate.getForEntity(APIUri, String.class).getBody();
        return result;
    }
}
