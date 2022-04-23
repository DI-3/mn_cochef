package com.aarondedi.chef.domain

import org.springframework.data.jpa.repository.JpaRepository

interface RecipeRepository : JpaRepository<Recipe, Int> {
    fun findByRecipeId(id :Int) : Recipe
}