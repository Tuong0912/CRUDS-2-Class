package com.example.crudaxios.service.product;

import com.example.crudaxios.model.Product;
import com.example.crudaxios.service.IGeneralService;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findAllByNameContaining(String name);

}
