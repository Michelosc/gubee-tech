package com.gubee.gubtech.service;

import com.gubee.gubtech.model.Product;
import com.gubee.gubtech.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> getAll() {
        return repository.findAll();
    }

    public List<Product> search(String stack) {
        String query = "%"+stack+"%";
        return repository.findByStackLikeIgnoreCase(query); }

    public Product save(Product product) {
        return repository.save(product);
    }

}
