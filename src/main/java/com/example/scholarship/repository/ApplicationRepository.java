package com.example.scholarship.repository;

import com.example.scholarship.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {
    // You can define custom queries here if needed
}
