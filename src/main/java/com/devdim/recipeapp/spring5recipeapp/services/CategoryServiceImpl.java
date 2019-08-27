package com.devdim.recipeapp.spring5recipeapp.services;

import com.devdim.recipeapp.spring5recipeapp.commands.CategoryCommand;
import com.devdim.recipeapp.spring5recipeapp.converters.CategoryCommandToCategory;
import com.devdim.recipeapp.spring5recipeapp.converters.CategoryToCategoryCommand;
import com.devdim.recipeapp.spring5recipeapp.domain.Category;
import com.devdim.recipeapp.spring5recipeapp.domain.Recipe;
import com.devdim.recipeapp.spring5recipeapp.repositories.CategoryRepository;
import com.devdim.recipeapp.spring5recipeapp.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * created by Dima on 8/8/2019.
 */
@Slf4j
@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final CategoryToCategoryCommand categoryToCategoryCommand;
    private final CategoryCommandToCategory categoryCommandToCategory;

    public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryToCategoryCommand categoryToCategoryCommand, CategoryCommandToCategory categoryCommandToCategory) {
        this.categoryRepository = categoryRepository;
        this.categoryToCategoryCommand = categoryToCategoryCommand;
        this.categoryCommandToCategory = categoryCommandToCategory;
    }

    @Override
    public Set<Category> getCategories() {
        Set<Category> categoriesSet = new HashSet<>();
        categoryRepository.findAll().iterator().forEachRemaining(categoriesSet::add);
        return categoriesSet;
    }

    @Override
    public CategoryCommand saveCategoryCommand(CategoryCommand command) {
        Category detachedCategory = categoryCommandToCategory.convert(command);
        Category savedCategory = categoryRepository.save(detachedCategory);
        return categoryToCategoryCommand.convert(savedCategory);
    }

}
