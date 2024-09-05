package kotlin.w5_2.data_type

fun main() {
    println("Enter your name :")
    val name: String = readlnOrNull().toString()
    println("The length : ${name.length} \n" +
            "The first character: ${name.first()} \n" +
            "The name is upercase: ${name.uppercase()} \n" +
            "The name is lowercase: ${name.lowercase()} \n" +
            "A substring of the name from the 2nd to the 5th character : ${name.substring(2,5)} \n"
    )

}