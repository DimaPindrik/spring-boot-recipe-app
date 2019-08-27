package com.devdim.recipeapp.spring5recipeapp.services;

import com.devdim.recipeapp.spring5recipeapp.commands.CategoryCommand;
import com.devdim.recipeapp.spring5recipeapp.converters.CategoryCommandToCategory;
import com.devdim.recipeapp.spring5recipeapp.converters.CategoryToCategoryCommand;
import com.devdim.recipeapp.spring5recipeapp.domain.Category;
import com.devdim.recipeapp.spring5recipeapp.domain.Recipe;
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
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("In: RecipeServiceImpl");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
