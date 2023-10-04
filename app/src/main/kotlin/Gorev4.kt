fun main() {

    val kriptoParaListesi = arrayListOf(
        KriptoParaCevap(
            ad = "Bitcoin",
            kriptoParaId = "BTC",
            hashAlgoritması = "SHA-256",
            aciklama = "Bitcoin, merkezi bir banka veya tek bir yönetici olmadan çalışan merkezi olmayan bir dijital para birimidir.",
            resim = "https://ornek.com/bitcoin.png",
            gunlukFiyat = 34789.21f,
            gunlukFiyatDegisimYuzdesi = -2.34f
        ),
        KriptoParaCevap(
            ad = "Ethereum",
            kriptoParaId = "ETH",
            hashAlgoritması = "Ethash",
            aciklama = "Ethereum, geliştiricilere akıllı sözleşmeler oluşturup dağıtmalarına olanak tanıyan açık kaynaklı, blockchain tabanlı bir platformdur.",
            resim = "https://ornek.com/ethereum.png",
            gunlukFiyat = 2110.45f,
            gunlukFiyatDegisimYuzdesi = 0.78f
        ),
        KriptoParaCevap(
            ad = "Litecoin",
            kriptoParaId = "LTC",
            hashAlgoritması = "Scrypt",
            aciklama = "Litecoin, dünya genelinde herkese anında ve neredeyse hiçbir maliyetle ödeme yapma imkanı sunan merkezi olmayan bir kripto para birimidir.",
            resim = "https://ornek.com/litecoin.png",
            gunlukFiyat = 129.57f,
            gunlukFiyatDegisimYuzdesi = -1.12f
        ),
        KriptoParaCevap(
            ad = "Ripple",
            kriptoParaId = "XRP",
            hashAlgoritması = null,
            aciklama = "Ripple, hızlı ve düşük maliyetli uluslararası para transferlerini kolaylaştırmak amacıyla tasarlanmış bir dijital ödeme protokolü ve kripto para birimidir.",
            resim = "https://ornek.com/ripple.png",
            gunlukFiyat = 0.5483f,
            gunlukFiyatDegisimYuzdesi = 1.45f
        )
    )

    val yeniKriptoParaListesi = kriptoParaListesi.map {
        KriptoParaUI(
            ad = it.ad,
            kriptoParaId = it.kriptoParaId,
            aciklama = it.aciklama,
            resim = it.resim
        )
    }

    yeniKriptoParaListesi.forEach { println(it) }
}

data class KriptoParaCevap(
    val ad: String,
    val kriptoParaId: String,
    val hashAlgoritması: String?,
    val aciklama: String,
    val resim: String,
    val gunlukFiyat: Float,
    val gunlukFiyatDegisimYuzdesi: Float
)

data class KriptoParaUI(
    val ad: String,
    val kriptoParaId: String,
    val aciklama: String,
    val resim: String
)
