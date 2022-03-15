//Tipe data Boolean memiliki nilai true atau false. Nilai 0 dan 1 tidak berlaku untuk menunjuk nilai pada sebuah variabel bertipe Boolean.
fun main(args: Array<String>) {
    var varBool : Boolean = true
    if(varBool)
        println("varBool bernilai " + varBool)
    var varInt : Int = 1
    //if(varInt) karna tidak terdapat kode Int tidak bolean
        println("varInt bernilai " + varInt)
}