package ru.rsreu.rodin.petprojectkotlin.dataSource.mock

import org.springframework.stereotype.Repository
import ru.rsreu.rodin.petprojectkotlin.dataSource.BankDataSource
import ru.rsreu.rodin.petprojectkotlin.model.Bank
import java.lang.IllegalArgumentException

@Repository
class MockBankDataSource : BankDataSource {

    val banks = mutableListOf(
        Bank("1234", 3.14, 17),
        Bank( "1010", 17.0, 0),
        Bank("5678", 0.0, 100),
    )

    override fun retrieveBanks(): List<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull { it.accountNumber == accountNumber } ?:
        throw NoSuchElementException("Could not find a bank with account number with $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if (this.banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number ${bank.accountNumber} already exist")
        }
        this.banks.add(bank)
        return bank
    }
}