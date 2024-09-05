package kotlin.w6_1.map

fun main() {

    val friendsAndAges = mapOf(
        "Islam" to 21,
        "Ahmed" to 22,
        "Ali" to 28
    )
    printFriendsAndAges(friendsAndAges)
    println("=================================================")
    printFriendsAndAges( increase(friendsAndAges))
    println("===================================================")
    println(findKeyByValue(friendsAndAges,21))
    println(findKeyByValue(friendsAndAges,26))

}

fun printFriendsAndAges(friendsAges: Map<String, Int>) {
    for ((name, age) in friendsAges) println("$name is $age years old.")
}

fun increase(map: Map<String, Int>): Map<String, Int> {
    val updatedMap = mutableMapOf<String, Int>()
    for ((key, value) in map) updatedMap[key] = value + 1
    return updatedMap
}


fun findKeyByValue(map: Map<String, Int>, value: Int): String {
    for ((key, mapValue) in map) if (mapValue == value) return key
    return "Not found"
    }

