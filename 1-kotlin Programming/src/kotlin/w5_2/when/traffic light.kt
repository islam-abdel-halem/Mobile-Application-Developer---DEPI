package kotlin.w5_2.`when`

fun main() {
    println("Enter a traffic light: ")
    val color: String = readln()
    when (color.lowercase()) {
        "red" -> println("Stop")
        "yellow" -> println("Wait")
        "green" -> println("Go")
        else -> println("Invalid color")
    }
}