package com.example.crudaxios.controller;

import com.example.crudaxios.model.Category;
import com.example.crudaxios.service.category.ICateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("cate")
public class CateController {
    @Autowired
    private ICateService cateService;

    @GetMapping
    public ResponseEntity<Iterable<Category>> findAll() {
        return new ResponseEntity<>(this.cateService.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createNewCity(@RequestBody Category cate) {
        this.cateService.save(cate);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PatchMapping("{id}")
    public ResponseEntity<Optional<Category>> findById(@PathVariable Long id) {
        return new ResponseEntity<>(this.cateService.findById(id), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> update(@PathVariable Long id, @RequestBody Category category) {
        if (this.cateService.findById(id).isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            category.setId(id);
            cateService.save(category);
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        this.cateService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
