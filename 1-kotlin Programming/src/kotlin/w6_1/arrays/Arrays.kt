package kotlin.w6_1.arrays

fun main() {
    var arr = intArrayOf(1, 2, 3, 4, 5, 77, 7, 8, 9, 10)
    printArray(arr)

    println("sum of integers is ${sumArray(arr)}")

    println("maximum ${maximumArray(arr)}")

}

fun printArray(arr: IntArray) {
    for (i in arr) println("$i ")
}

fun sumArray(arr: IntArray):Int{
    var sum:Int = 0
    for (i in arr) sum += i
    return sum
}

fun maximumArray(arr: IntArray): Int {
    var max:Int = arr[0]
    for (i in 1..<arr.size) max = maxOf(max, arr[i])
    return max
}