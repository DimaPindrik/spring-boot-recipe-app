package com.devdim.recipeapp.spring5recipeapp.controllers;

import com.devdim.recipeapp.spring5recipeapp.commands.CategoryCommand;
import com.devdim.recipeapp.spring5recipeapp.services.CategoryService;
import com.devdim.recipeapp.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by Dima on 8/4/2019.
 */
@Slf4j
@Controller
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index Page", CategoryController.class);
        model.addAttribute("categories", categoryService.getCategories());
        return "index";
    }

    @PostMapping
    @RequestMapping("category")
    public String saveOrUpdate(@RequestBody CategoryCommand command) {

        CategoryCommand savedCommand = categoryService.saveCategoryCommand(command);
        return "redirect:/category/show" + savedCommand.getId();
    }
}
