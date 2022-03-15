//String merupakan array dari karakter dan bersifat immutable (bersifat statis). Elemen suatu
// String dapat diakses dengan operasi indeks array contoh s[i] atau dengan menggunakan for-loop.

fun main(args: Array<String>) {
    val myName: String = "Desi Rahmawati"
    for(chr in myName){
        print(chr)
    }
    print('\n')

    //bisa menggabungkan string dengan tipe data lain dengan menggunakan operator +, sehingga tipe data yang digabungkan kedalam string.

    val s = "abc" + 1
    println(s + "def")

    //Untuk dapat menyimpan data String yang memuat keywords Kotlin bisa dengan menggunakan raw String yang dipisahkan dengan triple quotes (""").

    var text = """ 
        for (c in "foo") 
            print(c) 
    """
    println(text)

    // dapat menghapus spasi yang tidak diperlukan dalam raw String
    var textt = """ 
            |Tell me and I forget. 
            |Teach me and I remember. 
            |Involve me and I learn. 
            |(Benjamin Franklin) 
            """.trimMargin()
    println(textt)
}