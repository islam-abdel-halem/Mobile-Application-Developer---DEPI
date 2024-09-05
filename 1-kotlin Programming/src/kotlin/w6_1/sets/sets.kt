package kotlin.w6_1.sets

fun main() {
    var set1: Set<Int> = setOf(1,2,3,4,5)
    var set2: Set<Int> = setOf(1,8,3,9,5)

    println(intersection(set1, set2))

    var list: List<Int> = listOf(1,2,3,4,5,5,3)

    println(uniqueElements(list))

}

fun intersection(set1: Set<Int>, set2: Set<Int>): Set<Int> {
    var newSet: MutableSet<Int> = mutableSetOf()
    for (i in set1) if (set2.contains(i))  newSet.add(i)
    return newSet
}

fun uniqueElements(list: List<Int>): Set<Int> {
    var newSet:MutableSet<Int> = mutableSetOf()
    for (i in list) newSet.add(i)
    return newSet
}

