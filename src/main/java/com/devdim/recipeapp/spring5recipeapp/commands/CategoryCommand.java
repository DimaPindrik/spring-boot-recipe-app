package com.devdim.recipeapp.spring5recipeapp.commands;

import com.devdim.recipeapp.spring5recipeapp.domain.Recipe;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

/**
 * created by Dima on 8/27/2019.
 */
@Getter
@Setter
@NoArgsConstructor
public class CategoryCommand {

    private Long id;
    private String description;
    private Set<Recipe> recipes;
}
