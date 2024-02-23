package uk.ac.aber.myknajpa.model.models

class Money(
        var accountBalance: Int
    ) {

    // Method when user earns money for selling products
    fun revenueFunds(amount: Int) {
        accountBalance += amount
    }

    // Method for withdrawing funds
    fun productionSpending(productionCost: Int) {

        accountBalance -= productionCost
    }

    // Method for displaying the account balance
    fun displayAccountBalance() {
        println("Account balance: $accountBalance")
    }
    // Method for displaying the account balance
    @JvmName("getAccountBalance1")
    fun getAccountBalance():Int {
        return accountBalance
    }

}

