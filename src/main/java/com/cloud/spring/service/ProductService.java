package com.cloud.spring.service;

import com.cloud.spring.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    public List<Product> findAll();

    public Page<Product> findAll(Pageable pageable);

    public Optional<Product> findById(int id);

    public Product save(Product product);

    public boolean deleteById(int id);
}
