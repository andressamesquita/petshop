package com.example.petshop.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    val dono: String? = null
    val idade: Int? = null
    val tipo: String? = null
    val genero: String? = null
    val raca: String? = null
}
