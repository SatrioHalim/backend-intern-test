package com.example.simple_api_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ApiService {
    @Autowired
    private TransactionRepository transactionRepo;
    @Autowired
    private StatusRepository statusRepo;

    public Map<String, Object> getData() {
        Map<String, Object> result = new HashMap<>();
        result.put("data", transactionRepo.findAll());
        result.put("status", statusRepo.findAll());
        return result;
    }
}
