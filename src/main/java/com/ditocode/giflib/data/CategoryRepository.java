package com.ditocode.giflib.data;

import com.ditocode.giflib.model.Category;
import com.ditocode.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hector on 15/10/16.
 */
@Component
public class CategoryRepository {

    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "Java"),
            new Category(2, "Spring"),
            new Category(3, "Hibernate")
    );

    public Category findById(int id){
        for(Category category: ALL_CATEGORIES){
            if(category.getId() == id) {
                return category;
            }
        }
        return null;
    }
    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
}
