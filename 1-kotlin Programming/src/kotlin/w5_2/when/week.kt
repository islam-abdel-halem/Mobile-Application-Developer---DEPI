package kotlin.w5_2.`when`

fun main() {
    println("Enter day number: ")
    val dayNumber = readln().toInt()
    when(dayNumber) {
        1 -> println("Saturday")
        2 -> println("Sunday")
        3 -> println("Monday")
        4 -> println("Tuesday")
        5 -> println("Wednesday")
        6 -> println("Thursday")
        7 -> println("Friday")
        else -> println("Unknown day number")

    }

}