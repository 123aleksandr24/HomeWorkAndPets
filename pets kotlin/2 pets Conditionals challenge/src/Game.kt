@file:Suppress("IMPLICIT_CAST_TO_ANY")

fun main(args: Array<String>) {
    val name = "Madrigal"
//    var healthPoints = 100
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false
    var arrowsInQuiver = 2 //стрел в колчане
    val race = "gnome"

    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "orc" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "race not selected"
    }

    if (arrowsInQuiver >= 5) {
        println("Plenty of arrows") // стрел достаточно
    }
    println("Cannot hold any more arrows") // больше стрел нести нельзя


    // Аура
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal  // заменили иф элс и проверяем в auraColor
//    if (isBlessed && healthPoints > 50 || isImmortal) {
//        println("GREEN")
//    } else {
//        println("NONE")
//    }
    val auraColor = if (auraVisible)
        "GREEN"
    else
        "NONE"
    println(auraColor)

//    var healthStatus = if (healthPoints == 100) {  // можно состоянию сразу присвайвать условие . Почемув консоли пишет котлин юнит?
//        println("$name is in excellent condition!")
//    } else if (healthPoints in 90..99) {  // использование интервалов
//        if (isBlessed) {
//            println("$name has some minor wounds but is healing quite quickly!")
//        } else {
//            println("$name has some minor wounds.")
//        }
//        println("$name has a few scratches")
//    } else if (healthPoints >= 75) {
//        println("$name  has some minor wounds.")
//    } else if (healthPoints >= 15) {
//        println("$name  looks pretty hurt.")
//    } else {
//        println("$name is in awful condition!")
//    }   // Состояние игрока
//     println("$name + $healthStatus ")

//     val race = "gnome"
    //val faction = when (race) {
    //    "dwarf" -> "Keepers of the Mines"

// рефакторинг if в when
    val healthStatus = when (healthPoints) { // можно состоянию сразу присвайвать условие . Почемув консоли пишет котлин юнит?
        100 -> "$name is in excellent condition!"
     in 90..99 ->  "$name has a few scratches"
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
           "$name has some minor wounds."
        } // можно убрать фигурные скобики вообще
      in 15..74 -> "$name  looks pretty hurt."
        else -> "$name is in awful condition!"
    }
    // Состояние игрока
    println("$name + $healthStatus ")




}




