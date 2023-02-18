package ru.rsreu.rodin.petprojectkotlin.repository

import ru.rsreu.rodin.petprojectkotlin.model.Bank

interface BankDataSource {

    fun retrieveBanks(): List<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
    fun updateBank(bank: Bank): Bank
    fun deleteBank(accountNumber: String): Bank
}