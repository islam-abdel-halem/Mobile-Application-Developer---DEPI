package kotlin.w5_2.conditions

fun main() {
    println("Enrer your age :")
    val ageCategory = readln().toInt()

    if (ageCategory in 0 ..12)
        println("Your age is Child")
    else if (ageCategory in 13 ..19)
        println("Your age is Teenager")
    else if (ageCategory in 20 ..64)
        println("Your age is Adult")
    else
        println("Your age is Senior")

//    kotlin.w5_2.when (ageCategory) {
//        in  0 ..12 -> println("Your age is Child")
//        in 13 ..19 -> println("Your age is Teenager")
//        in 20 ..64 -> println("Your age is Adult")
//        else -> println("Your age is Senior")
//    }
}