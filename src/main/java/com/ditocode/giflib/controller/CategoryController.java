package com.ditocode.giflib.controller;

import com.ditocode.giflib.data.CategoryRepository;
import com.ditocode.giflib.data.GifRepository;
import com.ditocode.giflib.model.Category;
import com.ditocode.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by hector on 15/10/16.
 */
@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        List<Category> allCategories = categoryRepository.getAllCategories();
        modelMap.put("categories", allCategories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String categoryDetails(@PathVariable int id, ModelMap modelMap) {
        List<Gif> gifs = gifRepository.findByCategoryId(id);
        Category category = categoryRepository.findById(id);
        modelMap.put("gifs", gifs);
        modelMap.put("category", category);
        return "category";
    }


}
