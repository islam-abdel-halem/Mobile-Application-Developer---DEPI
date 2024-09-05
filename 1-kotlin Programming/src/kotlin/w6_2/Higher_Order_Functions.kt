package kotlin.w6_2

fun transformList(numbers: List<Int>, transform: (Int) -> Int): List<Int> {
    return numbers.map(transform)
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val doubleTransformation: (Int) -> Int = { it * 2 }

    val squareTransformation: (Int) -> Int = { it * it }

    val negateTransformation: (Int) -> Int = { -it }


    val doubledNumbers = transformList(numbers, doubleTransformation)
    println("Doubled Numbers: $doubledNumbers")

    val squaredNumbers = transformList(numbers, squareTransformation)
    println("Squared Numbers: $squaredNumbers")

    val negatedNumbers = transformList(numbers, negateTransformation)
    println("Negated Numbers: $negatedNumbers")
}
