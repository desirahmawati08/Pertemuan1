fun main(args: Array<String>) {
    //Parrot program
    println("Hi I'm Desi, the virtual parrot, and i love to repeat!");
    println("Type something in: ");
    var input: String
    input = readLine()!!
    var output: String
    output = input + ", " + input + "!"
    println(output)

}

//Perintah masukkan di Kotlin yaitu sebuah fungsi readLine()!!. S
// ecara default perintah masukkan di Kotlin akan mengembalikan nilai String ke dalam variabel penampung.