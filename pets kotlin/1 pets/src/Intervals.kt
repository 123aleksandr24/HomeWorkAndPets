// Изучение интервалов
fun main() {
    val age = 2
    1 in 1..3
    (1..3).toList()
    1 in 3 downTo 1
    1 in 1 until 3 // не выводит последний элемент
    3 in 1 until 3
    2 in 1..3
    2 !in 1..3
    'x' in 'a'..'z'
   for (i in 4 downTo 1 step 2) print(i) // i не инициализируем а step это шаг цикла

    // работа с tolist
    val generatePrimeFrom2 = generateSequence(3){ it + 2 }
    print(generatePrimeFrom2.take(10).toList())

}


