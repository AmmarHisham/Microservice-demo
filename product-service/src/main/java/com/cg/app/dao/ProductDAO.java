package com.cg.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.app.modal.Product;

@Repository
public interface ProductDAO extends JpaRepository<Product,String>{

}
