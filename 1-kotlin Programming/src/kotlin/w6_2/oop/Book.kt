package kotlin.w6_2.oop

class Book(
    val title: String,
    val author: String,
    var price: Double
){
    fun bookDetails() {
        println("Title: $title\nAuthor: $author \nPrice: $price")
    }

    fun applyDiscount(discount: Double) {
        if (discount in 0.0..100.0) {
            val amount = price * (discount / 100)
            price -= amount
        } else
            println("Invalid discount percentage")
    }
}