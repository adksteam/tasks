package com.example.repository;
import org.springframework.data.repository.CrudRepository;

import com.example.objects.Product;

public interface ProductRepository extends CrudRepository<Product,Integer>{

}
