package com.pilalab.back.service;

import com.pilalab.back.entity.MainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainRepository extends JpaRepository<MainEntity, String> {
    public List<MainEntity> findByUserId(String userId);
}
