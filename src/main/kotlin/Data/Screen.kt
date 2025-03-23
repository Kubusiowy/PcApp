package Data

enum class Screen {
    Start,
    DodajJury,
    DodajKonkurencje,
    DodajUczestnikow,
    WynikiCzesciowe,
    WynikiCalkowite
}

data class Konkurencja(
    val nazwa: String,
    val opis: String ,
    val uczestnicy: List<Uczestnik> = emptyList(),
)

data class Uczestnik(
    val imie: String,
    val nazwisko: String
)