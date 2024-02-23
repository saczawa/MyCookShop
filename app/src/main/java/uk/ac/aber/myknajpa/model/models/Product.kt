package uk.ac.aber.myknajpa.model.models

class Product(
    val name: String,
    val cookingTime: Int,
    val cost: Double,
    val price: Double,
    val type: ProductType,
    val section: Section,
    var total: Int = 0,
    var waste: Int = 0,
    var sold: Int = 0
) {


}