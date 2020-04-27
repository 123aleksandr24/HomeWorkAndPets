@file:JvmName("Hero")

import java.io.IOException

//более мягкое взаимодействие в джава

fun main(args: Array<String>) {
    val adversary = Java()  // вызов кода на джава из котлин
    println(adversary.utterGreeting()) //возвращает стринг

    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.toLowerCase())

    val adversaryHitPoints: Int = adversary.hitPoints // ссылка на хитпоинтс джава
    println(adversaryHitPoints.dec())
    println(adversaryHitPoints.javaClass) //382

    //adversary.greeting = "Hello, Hero." //384

    println(adversary.utterGreeting())

    // проверка как работает передача еды монстру
    adversary.offerFood()
    try {
        adversary.extendHandInFriendship()
    } catch (e: Exception) {
        println("Begone, foul beast!")
    }

    fun acceptApology() {
        throw IOException()
    }

}

fun makeProclamation() = "Greetings, beast!"

@JvmOverloads // аннотация для того чтобы не делать перегрузку методов как в джава
fun handOverFood(leftHand: String = "berries", rightHand: String = "beef") {
    println("Mmmm... you hand over some delicious $leftHand and $rightHand.")
}

@Throws(IOException::class) fun acceptApology() { //397
    throw IOException()
}

class Spellbook {
    @JvmField // открытие доступа
    val spells = listOf("Magic Ms. L", "Lay on Hans")

    companion object {   //бобавление объекта
        val MAX_SPELL_COUNT = 10
    }

    @JvmStatic     //393
    fun getSpellbookGreeting() = println("I am the Great Grimoire!")
}

