package kotlin.w6_2.oop

class BookStore {
    val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun removeBook(title: String) {
        val bookToRemove = books.find { it.title == title }
        if (bookToRemove != null) {
            books.remove(bookToRemove)
            println("$title removed from the bookstore.")
        } else
            println("Book not found.")
    }

    fun displayAllBooks() {
        if (books.isEmpty()) {
            println("Books not found.")
        } else {
            println("Books available in the bookstore:")
            books.forEach { it.bookDetails() }
        }
    }

}