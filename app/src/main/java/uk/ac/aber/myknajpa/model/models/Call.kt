package uk.ac.aber.myknajpa.model.models

class Call(
    val czas: String,
    val product: String,
    val ilosc: Int,
    var status: Status
    ) {
}