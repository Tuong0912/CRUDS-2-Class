package com.example.crudaxios.service.category;

import com.example.crudaxios.model.Category;
import com.example.crudaxios.repository.ICateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CateService implements ICateService {
    @Autowired
    private ICateRepository cateRepository;
    @Override
    public Iterable<Category> findAll() {
        return cateRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Category category) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
