package kotlin.w6_1.loops

fun main() {
    print("Enter the value of N: ")
    val n = readln().toInt()
    println( calculate(n))
    println( factorial(n))

}


fun calculate(n: Int): Int {
    var sum = 0
    for (i in 1..n) sum += i
    return sum
}

fun factorial(n: Int): Long {
    if (n == 0 || n == 1) return 1
    var result: Long = 1
    for (i in 2..n) result *= i
    return result
}