package ru.rsreu.rodin.petprojectkotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.rsreu.rodin.petprojectkotlin.model.Bank
import ru.rsreu.rodin.petprojectkotlin.service.BankService

@RestController
@RequestMapping("/api/banks")
class BankController(private val bankService: BankService) {

    @GetMapping
    fun getBanks(): Collection<Bank> = bankService.getBanks()

    @GetMapping("/{id}")
    fun getBankById(@PathVariable id: Long): Bank = bankService.getBanks()[id.toInt() - 1]
}