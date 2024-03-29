package com.devdim.recipeapp.spring5recipeapp.repositories;

import com.devdim.recipeapp.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * created by Dima on 8/6/2019.
 */
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
