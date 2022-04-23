package com.aarondedi.chef.services

import com.aarondedi.chef.domain.Recipe
import com.aarondedi.chef.domain.RecipeRepository
import org.springframework.stereotype.Service

@Service
class RecipeService(private val repository : RecipeRepository) {

    fun getRecipeById(id : Int) : Recipe {
        return repository.findByRecipeId(id);
    }
}