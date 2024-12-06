package com.example.scholarship.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.scholarship.model.Scholarship;

public interface ScholarshipRepository extends JpaRepository<Scholarship, Integer> {

}
