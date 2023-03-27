package com.pilalab.back.repository;

import com.pilalab.back.entity.MainEntity;
import com.pilalab.back.service.MainRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MainService {
    private final MainRepository mainRepository;

    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public List<MainEntity> getUserById(String userId) {

        return mainRepository.findByUserId(userId);
    }

    public List<MainEntity> findAll() {
        return mainRepository.findAll();
    }

}
