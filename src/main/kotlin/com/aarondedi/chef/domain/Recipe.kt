package com.aarondedi.chef.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name="recipe")
class Recipe {

    @Id
    @Column(name="id")
    var recipeId : Int = 0

    @Column(name="name")
    lateinit var name :String

    @Column(name = "description")
    lateinit var description : String
}