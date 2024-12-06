package com.example.scholarship.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "scholarship_table")
public class Scholarship {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String eligibilityCriteria;

    @Column(nullable = false)
    private String applicationLink;

    @Column(nullable = false)
    private String deadline;

    @Column(nullable = false)
    private String durationOfScholarship;

    // Required documents field, assuming it's now a String (e.g., file path or document name)
    @Column(nullable = true)  // If requiredDocuments is optional, allow it to be null in the database
    private String requiredDocuments; 

    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }
    
    public void setEligibilityCriteria(String eligibilityCriteria) {
        this.eligibilityCriteria = eligibilityCriteria;
    }
    
    public String getApplicationLink() {
        return applicationLink;
    }
    
    public void setApplicationLink(String applicationLink) {
        this.applicationLink = applicationLink;
    }

    public String getDeadline() {
        return deadline;
    }
    
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    
    public String getDurationOfScholarship() {
        return durationOfScholarship;
    }
    
    public void setDurationOfScholarship(String durationOfScholarship) {
        this.durationOfScholarship = durationOfScholarship;
    }

    public String getRequiredDocuments() {
        return requiredDocuments;
    }
    
    public void setRequiredDocuments(String requiredDocuments) {
        this.requiredDocuments = requiredDocuments;
    }
}
