package com.example.demo.repository;

import com.example.demo.model.NewsCategories;
import com.example.demo.model.NewsItems;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ItemRepository extends JpaRepository<NewsItems, Integer> {
    List<NewsItems> findByCategories_Id(int catId);
    //all crud database method
}