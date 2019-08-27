package com.devdim.recipeapp.spring5recipeapp.services;

import com.devdim.recipeapp.spring5recipeapp.commands.CategoryCommand;
import com.devdim.recipeapp.spring5recipeapp.domain.Category;

import java.util.Set;

/**
 * created by Dima on 8/8/2019.
 */
public interface CategoryService {

    Set<Category> getCategories();

    CategoryCommand saveCategoryCommand(CategoryCommand command);
}
