package com.devdim.recipeapp.spring5recipeapp.services;

import com.devdim.recipeapp.spring5recipeapp.commands.CategoryCommand;
import com.devdim.recipeapp.spring5recipeapp.domain.Category;
import com.devdim.recipeapp.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * created by Dima on 8/8/2019.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
