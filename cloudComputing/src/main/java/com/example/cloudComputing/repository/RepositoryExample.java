package com.example.cloudComputing.repository;

import com.example.cloudComputing.model.ModelExample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryExample extends JpaRepository<ModelExample, Long> {
}