fun main() {

    val ogrenciler = arrayListOf(
        Ogrenci("eda", 20, "Üniversite A"),
        Ogrenci("ece", 27, "Üniversite B"),
        Ogrenci("yusuf", 22, "Üniversite C"),
        Ogrenci("adile", 21, "Üniversite A"),
        Ogrenci("memet", 29, "Üniversite B"),
        Ogrenci("halil", 24, "Üniversite A"),
        Ogrenci("nese", 28, "Üniversite B"),
        Ogrenci("ceylan", 26, "Üniversite A")
    )

    val enYasliOgrenci = ogrenciler.maxBy { it.yas }
    val enGencOgrenci = ogrenciler.minBy { it.yas }

    val enYasliIndex = ogrenciler.indexOf(enYasliOgrenci)
    val enGencIndex = ogrenciler.indexOf(enGencOgrenci)

    println("En yaşlı öğrencinin adı -> ${enYasliOgrenci.ad} | index -> $enYasliIndex")
    println("En genç öğrencinin adı -> ${enGencOgrenci.ad} | index -> $enGencIndex")
    println()

    val filtrelenmisOgrenciler = ogrenciler.filter { it.okul == "Üniversite A" }
    println("Filtrelenmiş Okul -> ${filtrelenmisOgrenciler.joinToString("\n-> ")}")
    println()

    println("Yaşı > 25 olanlar --> ${filtrelenmisOgrenciler.filter { it.yas > 25 }}")
    println("Yaşı < 25 olanlar --> ${filtrelenmisOgrenciler.filter { it.yas < 25 }}")
}

data class Ogrenci(val ad: String, val yas: Int, val okul: String)
