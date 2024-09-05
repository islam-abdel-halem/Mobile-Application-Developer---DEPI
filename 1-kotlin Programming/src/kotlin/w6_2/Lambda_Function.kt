package kotlin.w6_2

fun main() {
    var numbers: List<Int> = listOf(1,2,3,4,5)
    val even = numbers.filter { it % 2 == 0 }
    val squared = even.map { it * it }
    println("Even Numbers: $even")
    println("================================================")
    println("Squared: $squared")


}