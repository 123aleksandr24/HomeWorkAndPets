import java.io.File
import kotlin.math.roundToInt
const val TAVERN_NAME = "Taernyl's Folly"
fun main() {

    val playername = "Estragon"
    var experiencePoints = 5
    experiencePoints += 5
    val hasSteed = true
    val tavern = "Eastern"
    val tavernchik = "Vas"
    val money = 50
    println(hasSteed)
    println(experiencePoints)
    println(playername)
    println(money)
    println(tavern)
    println(tavernchik)
    // страница 52 сделать дз

    val gold: Int = "5.91".toIntOrNull() ?: 0 // безопасное преобразование

    "Dragon's Breath".forEach {
        println("$it\n")
    } //  forEach выведет все символы по очереди

    placeOrder("shandy,Dragon's Breath,5.91")
    placeOrder("elixir,Shirley's Temple,4.12")

    // <String> - опеределяет параметр типа принимаемых значении листа List
    val patronList: List<String> = listOf("Eli", "Mordoc", "Sophie")
    println(patronList)
    //извлечение первого и последнего элемента списка
    patronList.first() // Eli
    patronList.last() // Sophie

//    val patronList = mutableListOf("Eli", "Mordoc", "Sophie") // изменяемый список стр 181
//    fun main(args: Array<String>) {
//        placeOrder("shandy,Dragon's Breath,5.91")
//        println(patronList)
//        patronList.remove("Eli")
//        patronList.add("Alex")
//        println(patronList)

//    // безопасный поисмк по индексу getOrElse
//    val patronList = listOf("Eli", "Mordoc", "Sophie")
//    patronList.getOrElse(4) { "Unknown Patron" }
    // проверка пристутствия посетителя с помощью conyains
        if (patronList.contains("Eli")) {
            println("The tavern master says: Eli's in the back playing cards.")
        } else {
        println("The tavern master says: Eli isn't here.")
        }
    //ропверка присутствия нескольких посетителей
    if (patronList.containsAll(listOf("Sophie", "Mordoc"))) {
        println("The tavern master says: Yea, they're seated by the stew kettle.")
    } else {
        println("The tavern master says: Nay, they departed hours ago.")
    }

    for (patron in patronList) {
        println("Good evening, $patron")
    } // прменили список патрон к патронлисту и задали для каждого Good evening
    // цикл фор в котлине
    for(i in 1..10){ println(i) }

    // функция let
    val firstItemSquared = listOf(1,2,3).first().let {
        it * it    }
    // заместо
    //val firstElement = listOf(1,2,3).first()
    //val firstItemSquared = firstElement * firstElement

    // also 172 стр
//    var fileContents: List<String>
//    File("file.txt")
//            .also {
//                print(it.name)
//            }.also {
//                fileContents = it.readLines()
//            }

    // возвр тру или фолс takeIf стр172
    val fileContents = File("myfile.txt")
            .takeIf { it.canRead() && it.canWrite() }
            ?.readText()
    // без takeIf
//    val file = File("myfile.txt")
//    val fileContents = if (file.canRead() && file.canWrite()) {
//        file.readText()
//    } else {
//        null
//    }

   // Следующий код читает файл, если он не скрытый (и возвращает null, если скрытый):  не рекомендуется
    //val fileContents = File("myfile.txt").takeUnless { it.isHidden }?.readText()



    var isTavernOpen = true
    val isClosingTime = false
    while (isTavernOpen == true) {
        if (isClosingTime) {
            isTavernOpen = false
        }
        println("Having a grand old time!")
    }

    var orderCount = 0
    while (orderCount <= 9) {
        placeOrder(uniquePatrons.shuffled().first(),
                menuList.shuffled().first())
        orderCount++    }
    displayPatronBalances()

//    (0..9).forEach {    // 352
//        val first = patronList.random()
//        val last = lastName.random()
//    }
//
//    uniquePatrons.forEach {
//        patronGold[it] = 6.0
//    }
//
//    var orderCount = 0
//    while (orderCount <= 9) {
//        placeOrder(uniquePatrons.random(),
//                menuList.random())
//        orderCount++
//    }
//    displayPatronBalances()

}

//fun placeOrder(menuData: String) {  // принимает в параметр меню выше
//    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
//    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe) // until создаёт интервал , исключающий верхнюю границу символа \,
//    println("Madrigal speaks with $tavernMaster about their order.")
//
//    val data = menuData.split(',')
//    val type = data[0]
//    val name = data[1]
//    val price = data[2]
//    val message = "Madrigal buys a $name ($type) for $price."
//    println(message)
//
//    val phrase = if (name == "Dragon's Breath") {
//        "Madrigal exclaims ${toDragonSpeak("Ah, delicious $name!")}"
//    } else {
//        "Madrigal says: Thanks for the $name."
//    }
//    println(phrase) // если он выпил этот напиток то он начинает говорить по драконьи

// перевод аргумента price в Double cnh 160 не понял
private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")
    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price."
    println(message)
    performPurchase(price.toDouble())

    // настройка с помощью apply
    val menuFile = File("menu-file.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }


    fun displayBalance() {
        TODO("Not yet implemented")
    }

//    println(uniquePatrons)
//
//    var orderCount = 0
//    while (orderCount <= 9) {
//        placeOrder(uniquePatrons.shuffled().first(),
//                menuList.shuffled().first())
//        orderCount++
//    }  //стр197 посмотреть

    //distinct вызывает сразу toSet и toList
//    val patrons = listOf("Eli Baggins", "Eli Baggins", "Eli Ironfoot").distinct()
//    [Eli Baggins, Eli Ironfoot]
//    patrons[0]
//    Eli Baggins

    // что не то ? стр 161
//    fun performPurchase(price: Double) {
//        displayBalance()
//        val totalPurse = playerGold + (playerSilver / 100.0)
//        println("Total purse: $totalPurse")
//        println("Purchasing item for $price")
//        val remainingBalance = totalPurse - price }
////    println("Remaining balance: ${"%.2f".format(remainingBalance)}") округляет
//}
//    fun performPurchase(price: Double) {
//        displayBalance()
//        val totalPurse = playerGold + (playerSilver / 100.0)
//        println("Total purse: $totalPurse")
//        println("Purchasing item for $price")
//        val remainingBalance = totalPurse - price
//        println("Remaining balance: ${"%.2f".format(remainingBalance)}")
//        val remainingGold = remainingBalance.toInt()
//        val remainingSilver = (remainingBalance % 1 * 100).roundToInt() // округление до инта 164стр
//        playerGold = remainingGold
//        playerSilver = remainingSilver
//        displayBalance() }

//    val phrase = "Ah, delicious $name!"
//    println("Madrigal exclaims: ${toDragonSpeak(phrase)}") // принимает фразу с вызовом драгонспик
}


fun performPurchase(toDouble: Double) {

}

// c let
fun formatGreeting(vipGuest: String?): String {
    return vipGuest?.let {
        "Welcome, $it. Please, go straight back - your table is ready."
    } ?: "Welcome to the tavern. You'll be seated soon."
}
//без let
//fun formatGreeting(vipGuest: String?): String {
//    return if (vipGuest != null) {
//        "Welcome, $vipGuest. Please, go straight back - your table is ready."
//    } else {
//        "Welcome to the tavern. You'll be seated shortly."
//    }
//}

// 170стр метод run
val menuFile = File("menu-file.txt")
val servesDragonsBreath = menuFile.run {
    readText().contains("Dragon's Breath")
}
//// выполнение ссылки на функцию метода run  стр170
//fun nameIsLong(name: String) = name.length >= 20
//    "Madrigal".run(::nameIsLong) // Ложь  . Выгодно использовать для нескольких функций.
//     "Polarcubis, Supreme Master of NyetHack".run(::nameIsLong)
//// Истина

// with - объект приёмник передаётся в первом аргументе
val nameTooLong = with("Polarcubis, Supreme Master of NyetHack") {
    length >= 20
}

private fun toDragonSpeak(phrase: String) =
        phrase.replace(Regex("[aeiou]")) {
            when (it.value) {
                "a" -> "4"
                "e" -> "3"
                "i" -> "1"
                "o" -> "0"
                "u" -> "|_|"
                else -> it.value
            }
        }

//// обновволение значений в патронголд 211
//fun performPurchase(price: Double, patronName: String) {
//    val totalPurse = patronGold.getValue(patronName)
//    patronGold[patronName] = totalPurse - price }

//372
(0..9).forEach {
    val first = patronList.random()
    val last = lastName.random()
    val name = "$first $last"
    uniquePatrons += name
}

//373
val uniquePatrons: Set<String> = generateSequence {
    val first = patronList.random()
    val last = lastName.random()
    "$first $last"
}.take(10).toSet()

