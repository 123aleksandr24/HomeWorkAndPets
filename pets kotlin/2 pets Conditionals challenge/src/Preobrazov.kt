import kotlin.system.measureNanoTime

val animals = listOf("zebra", "giraffe", "elephant", "rat")
val babies = animals
        .map{ animal -> "A baby $animal" }
        .map{ baby -> "$baby, with the cutest little tail ever!"}
println(babies)

//объединение двух списков в один
listOf(listOf(1, 2, 3),listOf(4, 5, 6)).flatMap { it } // 363
//[1, 2, 3, 4, 5, 6]

val itemsOfManyColors = listOf(listOf("red apple", "green apple", "blue apple"),
        listOf("red fish", "blue fish"), listOf("yellow banana", "teal banana"))
val redItems = itemsOfManyColors.flatMap { it.filter { it.contains("red") } }
print(redItems) //364
//[red apple, red fish]

// фильтрация нпростых чисел 364
val numbers = listOf(7, 4, 8, 4, 3, 22, 18, 11)
val primes = numbers.filter { number ->    (2 until number).map { number % it }
        .none { it == 0 }
}
print(primes)

// объединение в два списка zip
val employees = listOf("Denny", "Claudette", "Peter")
val shirtSize = listOf("large", "x-large", "medium")
val employeeShirtSizes = employees.zip(shirtSize).toMap()  // zip объединяет два списка toMap получает ассоциативный массив
println(employeeShirtSizes["Denny"])

//комбинирование значений
val foldedValue = listOf(1, 2, 3, 4).fold(0) { accumulator, number ->
    println("Accumulated value: $accumulator")
    accumulator + (number * 3)
}
println("Final value: $foldedValue")

//функция итератор
generateSequence(0) { it + 1 }
.onEach { println("The Count says: $it, ah ah ah!") }

// Расширение для Int, которое проверяет, является ли число простым
fun Int.isPrime(): Boolean {
    (2 until this).map {
        if (this % it == 0) {
            return false // Не простое! /
        }
    }
    return true
}    val toList = (1..5000).toList().filter { it.isPrime() }.take(1000)

val oneThousandPrimes = generateSequence(3) { value ->
    value + 1
}.filter { it.isPrime() }.take(1000)

// преобразование списка в последователность
val listOfNumbers = (0 until 10000000).toList()
val sequenceOfNumbers = listOfNumbers.asSequence()

val listInNanos = measureNanoTime {        // Цепочка функций для обработки списка
}

    val sequenceInNanos = measureNanoTime { // Цепочка функций для обработки последовательности    }
        println("список обработан за $listInNanos наносекунд ")  //
        println("последовательность обработана за $sequenceInNanos наносекунд") //371

        // Использование Either позволяет выразить операцию, которая может закончиться сбоем, не прибегая к исключениям и не требуя использовать оператор try/catch.
        fun parse(s: String): Either<NumberFormatException, Int> =  //371
                if (s.matches(Regex("-?[0-9]+"))) {
                    Either.Right(s.toInt())
                } else {
                    Either.Left(NumberFormatException("$s is not a valid integer."))
                }
        val x = parse("123")
        val value = when(x) {
            is Either.Left -> when (x.a) {
                is NumberFormatException -> "Not a number!"
                else -> "Unknown error"
            }
            is Either.Right -> "Number that was parsed: ${x.b}"
        }


        val gradesByStudent = mapOf("Josh" to 4.0, "Alex" to 2.0, "Jane" to 3.0)
        {Josh=4.0, Alex=2.0, Jane=3.0}
        flipValues(gradesByStudent)  //меняет местами занчение и ключ
        {4.0=Josh, 2.0=Alex, 3.0=Jane}



