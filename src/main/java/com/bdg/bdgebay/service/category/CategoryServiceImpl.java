package com.bdg.bdgebay.service.category;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bdg.bdgebay.entity.Category;
import com.bdg.bdgebay.repository.user.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	private CategoryRepository categoryRepository;

    @Transactional
    @Override
    public List<Category> allCategories() {
        return categoryRepository.findAll();
    }


    @Autowired
    public void setCategoryRepository(final CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

}
