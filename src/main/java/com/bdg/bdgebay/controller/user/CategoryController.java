package com.bdg.bdgebay.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bdg.bdgebay.repository.user.CategoryRepository;
import com.bdg.bdgebay.service.category.CategoryService;

@RestController
public class CategoryController {
	
	private CategoryService categoryService;


    @RequestMapping(path = "/category/categories", method = RequestMethod.POST)
    public List<CategoryRepository> categories() {
        return categoryService.allCategories();
    }


    @Autowired
    public void setCategoryService(final CategoryService categoryService) {
        this.categoryService = categoryService;
    }

}
