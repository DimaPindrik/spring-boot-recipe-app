package com.devdim.recipeapp.spring5recipeapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * created by Dima on 8/6/2019.
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
