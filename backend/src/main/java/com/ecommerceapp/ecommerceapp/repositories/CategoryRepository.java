package com.ecommerceapp.ecommerceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerceapp.ecommerceapp.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
