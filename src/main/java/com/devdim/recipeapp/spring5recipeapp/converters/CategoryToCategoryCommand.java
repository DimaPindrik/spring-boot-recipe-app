package com.devdim.recipeapp.spring5recipeapp.converters;

import com.devdim.recipeapp.spring5recipeapp.commands.CategoryCommand;
import com.devdim.recipeapp.spring5recipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * created by Dima on 8/27/2019.
 */
@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if (source == null) {
            return null;
        }
        final CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(source.getId());
        categoryCommand.setDescription(source.getDescription());
        categoryCommand.setRecipes(source.getRecipes());
        return categoryCommand;
    }
}
