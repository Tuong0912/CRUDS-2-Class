package com.example.crudaxios.repository;

import com.example.crudaxios.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICateRepository extends JpaRepository<Category, Long> {
}
