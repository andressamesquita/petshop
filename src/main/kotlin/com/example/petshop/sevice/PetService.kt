package com.example.petshop.sevice

import com.example.petshop.model.Pet
import com.example.petshop.repository.PetRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetService (private val petRepository: PetRepository) {
    fun cadastrar(pet: Pet): Pet {
        val novoPet = petRepository.save(pet)
        return novoPet
    }

    fun buscarPorId(id: Long): Pet {
        return petRepository.findById(id).get()
    }
}