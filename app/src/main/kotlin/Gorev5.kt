fun main() {

    val calisanlar = arrayListOf(
        Calisan("Ali", 15000.0),
        Calisan("Ece", 32000.0),
        Calisan("Iraz", 29000.0),
        Calisan("Veda", 18500.0),
        Calisan("Yusuf", 25000.0)
    )

    val yeniListe = calisanlar.map {
        val guncelMaas = it.maas + ((it.maas * 35) / 100)
        it.isim to guncelMaas
    }
    yeniListe.forEach { (isim, maas) ->
        println("Çalışanın adı: $isim | %35 zam sonrası maaş: $maas")
    }
    println()

    println("En küçükten en büyüğe sıralama -> ${yeniListe.shuffled().sortedBy { it.second }}")
    println()

    println("En yüksek maaş -> ${yeniListe.maxBy { it.second }}")
    println("En düşük maaş -> ${yeniListe.minBy { it.second }}")
    println()

    val ortalamaMaas = yeniListe.sumOf { it.second } / yeniListe.size
    println("Ortalama maaş -> $ortalamaMaas")
}

data class Calisan(val isim: String, val maas: Double)
