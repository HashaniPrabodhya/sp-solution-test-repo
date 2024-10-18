package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.NewsCategories;
import com.example.demo.model.NewsItems;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/news")
public class NewsController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping("/{catId}/newsitems")
    public List<NewsItems> getNewsItemsByCategory(@PathVariable int catId) {
        return itemRepository.findByCategories_Id(catId);
    }

    // Get news item details by category ID and item ID
    @GetMapping("/{catId}/newsitems/itemid/{itemId}")
    public ResponseEntity<NewsItems> getNewsItemById(@PathVariable int catId, @PathVariable int itemId) {
        NewsItems newsItem = itemRepository.findById(itemId)
                .orElseThrow(() -> new ResourceNotFoundException("News item not found with id: " + itemId));

        // Check if the news item belongs to the given category
        if (!newsItem.getCategories().stream().anyMatch(cat -> cat.getId() == catId)) {
            throw new ResourceNotFoundException("News item with id: " + itemId + " does not belong to category: " + catId);
        }

        return ResponseEntity.ok(newsItem);
    }



}