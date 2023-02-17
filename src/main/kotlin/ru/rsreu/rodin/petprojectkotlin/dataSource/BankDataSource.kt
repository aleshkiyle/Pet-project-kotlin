package ru.rsreu.rodin.petprojectkotlin.dataSource

import ru.rsreu.rodin.petprojectkotlin.model.Bank

interface BankDataSource {

    fun retrieveBanks(): List<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
}