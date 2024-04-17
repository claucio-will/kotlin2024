package outros

fun main() {

    val account2 = Account2(100.0)
    account2.deposit(100.0)
    account2.withdraw(100.0)
    account2.withdraw(500.0)
    println(account2.balance)
}
class Account2(balance: Double = 0.0) {
    init {
        require(balance >= 0)
    }

   var balance = balance
       private set

    fun deposit(amount: Double){
        require(amount >= 0)
        balance += amount
    }

    fun withdraw(amount: Double){
        require(amount >= 0)
        balance -= amount
    }
}