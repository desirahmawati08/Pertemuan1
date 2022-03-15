
fun main(args: Array<String>) {
    //contoh menggunakan tipe data bilangan bulat
    val minByte: Byte = -128
    val maxByte: Byte = 127 // 8bit
    val minShort: Short = -32768
    val maxShort: Short = 32767 // 16bit
    val minInt: Int = -2147483648
    val maxInt: Int = 2147483647 // 32bit
    val minLong: Long = -9223372036854775807
    val maxLong: Long = 9223372036854775807 // 64bit

    println("bilangan bulat")
    println("-----------------------------------------")
    println("minByte:" + minByte)
    println("maxByte:" + maxByte)
    println("minShort:" + minShort)
    println("maxShort:" + maxShort)
    println("minInt:" + minInt)
    println("maxInt:" + maxInt)
    println("minLong:" + minLong)
    println("maxLong:" + maxLong)

    //contoh menggunakan tipe data bilangan decimal
    val maxFloat: Float = 9.123456789f //untuk memberikan niali sebagai float maka harus memberikan akhiran f pada akhir literal
    val maxDouble: Double = 9.123456789

    println("tipe data bilangan decimal")
    println("-----------------------------------------")
    println("maxFloat:" + maxFloat)
    println("maxDouble:" + maxDouble)

    //contoh constants literal
    val floatLiteral : Float = 178.95F //Literal Float
    println("constans literal")
    println("-----------------------------------------")
    println("Contoh Literal Float : " + floatLiteral)

    val oneBillion: Long = 1000000000L //Literal Long
    println("Contoh Literal Long : " + oneBillion)

    val valHeksa = 0x0F //Literal heksadesimal diawali dengan 0x
    println("Contoh Literal Heksadesimal  : " + valHeksa)
    val valBinary = 0b00001011 //Literal binary diawali dengan 0b
    println("Contoh Literal Binary : " + valBinary)

    val notasiKonvensional = 123.5e10
    println("Contoh Literal Konvensional Floating Point Number : " + notasiKonvensional)
}