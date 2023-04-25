import javax.security.auth.login.AccountException
import kotlin.time.measureTime

fun main() {
    var bank=CurrentAccount(565758,"Purity Nyaboke",50000.00)
    bank.deposit(10000.00)
    println(bank.balance)
    bank.withdraw(5000.00)
    println(bank.balance)
    bank.details()
    println( x("elephant"))
    validation("AnnaBRENDA")






}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)

/* input string output first character index 0 last character -1 and length of string ,string.length
 check whether it begins with a vowel or not creat an array a
 */



fun x(name :String):String{
    var a=name[0]
    var b= name[-1]
    var c=name.length
    var array= arrayOf('a','e','i','o','u')
    for(i in name){
        if (name[0] in array){
           println(name)
        }
        else{
            println("null")
        }
    }
    return name



}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false (7pts)

/* input password check if the passsword is 8 characters long and 16 character less if passwword return null must contan
a gigit  returns true or false
 */
fun validation(password:String):Boolean{
    if(password.length>8 && password.length<16){
        println("Invalid password")
    }
    else if (password==="Password"){
        println("Invald password")

    }
    else{
        return true
    }
    return true
}

//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!” (5pts)
fun multiples(x:Array<Int>){
    for (i in x){

        if (i %6==0 && i%8==0){
            println("Bingo")

        }
        else {
            println(i)

        }
    }



}
















//4. Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z” (6pts)
 open class CurrentAccount(var accountNumber:Int ,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        balance+=amount
    }
    fun withdraw(amount: Double){
        balance-=amount
    }
    fun details (){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)
//class SavingsAccount(var withdrawals:Int):CurrentAccount(var accountNumber:Int ,var accountName:String,var balance:Double)
