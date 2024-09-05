package kotlin.w6_2.oop

fun main() {
    val myBookStore = BookStore()

    val book1 = Book("Clean Coder", "Robert C. Martin", 100.99)
    val book2 = Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", 174.99)
    val book3 = Book("Clean Architecture", "Robert C. Martin", 132.99)

    myBookStore.addBook(book1)
    myBookStore.addBook(book2)
    myBookStore.addBook(book3)

    myBookStore.displayAllBooks()

    book1.applyDiscount(10.0)
    println("After applying a discount:")
    book1.bookDetails()

    myBookStore.removeBook("Clean Architecture")

    myBookStore.displayAllBooks()
}