package com.devdim.recipeapp.spring5recipeapp.repositories;

import com.devdim.recipeapp.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * created by Dima on 8/6/2019.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

    @Override
    Optional<Category> findById(Long id);

    Optional<Category> findByDescription(String description);

}
