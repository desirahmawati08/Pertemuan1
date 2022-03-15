fun main(args: Array<String>) {
    //Simple calculator
    println("Welcome to calculator")
    println("masukkan angka pertama:")
    val a = readLine()!!.toDouble()
    println("masukkan angka kedua:")
    val b = readLine()!!.toDouble()
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a / b
    println("Sum: ${sum}")
    println("Difference: ${difference}")
    println("Product: ${product}")
    println("Quotient: ${quotient}")
    println("Thank you for using calculator.")
}