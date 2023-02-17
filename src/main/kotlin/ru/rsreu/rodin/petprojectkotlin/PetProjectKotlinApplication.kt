package ru.rsreu.rodin.petprojectkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PetProjectKotlinApplication

fun main(args: Array<String>) {
	runApplication<PetProjectKotlinApplication>(*args)
}
