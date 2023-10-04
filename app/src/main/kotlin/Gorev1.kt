fun main() {

    val isimListesi = arrayListOf("Selin", "Emre", "Deniz", "Ahmet", "Zeynep")
    println("Lütfen virgülle ayrılmış 3 isim girin!")
    print("İsimler: ")
    val girilenIsimler = readLine()
    val kullaniciListesi = girilenIsimler?.split(",")?.toList()

    if (!kullaniciListesi.isNullOrEmpty()) {
        isimListesi.addAll(kullaniciListesi)
        println(isimListesi)
    } else {
        println("Lütfen 3 isim girin!")
    }
}
