package com.example.demo.repository;

import com.example.demo.model.NewsCategories;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface CategoryRepository extends JpaRepository<NewsCategories, Integer> {
        //all crud database method
    }


