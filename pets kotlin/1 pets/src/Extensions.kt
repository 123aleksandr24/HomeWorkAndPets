val String.numVowels    get() = count { "aeiouy".contains(it) } // свойство расширения


fun String.addEnthusiasm(amount: Int = 1) = this + "!".repeat(amount) // объявление функции расширения

//fun Any.easyPrint(): Any {
//    println(this)
//    return this
//}

fun <T> T.easyPrint(): T {
    println(this)
    return this
}

infix fun String?.printWithDefault(default: String) = print(this ?: default) //расширение с поддержкой нулл

private fun <T> Iterable<T>.random(): T = this.shuffled().first() // расширение random

fun main(args: Array<String>) {
    println("Madrigal has left the building".addEnthusiasm())
    42.easyPrint() // вызов фи Anyprint
    "How many vowels?".numVowels.easyPrint()  // использование свойства расширения

    val nullableString: String? = null // расширение нулл
    nullableString printWithDefault "Default string"
}
