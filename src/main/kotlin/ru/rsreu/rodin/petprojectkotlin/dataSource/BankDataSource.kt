package ru.rsreu.rodin.petprojectkotlin.dataSource

import ru.rsreu.rodin.petprojectkotlin.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}