package kotlin.w6_1.lists

fun main() {
    var list: List<Int> = listOf(1,2,3,4,5,6,7,8,9,10)

    println(listEven(list))
    println(doubledElement(list))

}

fun listEven(list: List<Int>): List<Int> {
    var newList: MutableList<Int> = mutableListOf()
    for (i in list)  if (i % 2 == 0) newList.add(i)
    return newList
}

fun doubledElement(list: List<Int>): List<Int> {
    var newList: MutableList<Int> = mutableListOf()
    for (i in list)  newList.add(i*2)
    return newList
}