fun main() {

    val isimler = arrayListOf("Seda", "Ali", "Hasan", "Can", "Giray")
    isimler.sort()
    println("Sıralama: $isimler")

    println("Lütfen bir isim girin!")
    print("İsim: ")
    val kullaniciIsim = readLine()
    if (isimler.contains(kullaniciIsim)){
        println("Sonuç: ${kullaniciIsim?.uppercase()?.reversed()}")
    }
    else println("Bu isim bulunamadı!")
}
