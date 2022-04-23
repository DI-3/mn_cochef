package com.aarondedi.chef.controllers

import com.aarondedi.chef.domain.Recipe
import com.aarondedi.chef.services.RecipeService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RecipeController(private val recipeService : RecipeService) {

    data class Message(val id: String?, val text: String)

    @GetMapping(path = ["/recipes"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun recipes(): List<Message> = listOf(
            Message("1", "Hello!"),
            Message("2", "Bonjour!"),
            Message("3", "Privet!"),
    )

    @GetMapping(path = ["/recipe"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun recipe(@RequestParam("recipeId") id : String): Recipe =
            recipeService.getRecipeById(id.toInt())


}

