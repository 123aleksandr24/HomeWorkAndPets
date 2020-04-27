@file:Suppress("IMPLICIT_CAST_TO_ANY", "TYPE_INFERENCE_ONLY_INPUT_TYPES_WARNING")

import sun.jvm.hotspot.oops.CellTypeState.value
import java.io.File
import kotlin.math.pow
import kotlin.system.exitProcess

// задание с аурой внизу стр 75

private val Any.name: Any?
    get() {}

fun main(args: Array<String>) {
    val name = "Madrigal"
//    var healthPoints = 100
    var healthPoints = 89
    var isBlessed = true
    val isImmortal = false
    var arrowsInQuiver = 2 //стрел в колчане
    val race = "gnome"
    Player2("Madrigal")



    Game.play()  // вызов object Game

    var currentRoom: Room = Room("Foyer")TownSquare()  // вызов реализации функции подкласса
    println(currentRoom.description())
    println(currentRoom.load())

    // Состояние игрока
    printPlayerStatus(player) // стр 285

    val player = Player() // создание функции которая вызывает класс
    player.castFireball()

    val auraColor = player.auraColor(isBlessed, healthPoints, isImmortal) // принятие экземпляра Player как аргумент


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
//    val auraVisible = isBlessed && healthPoints > 50 || isImmortal  // заменили иф элс и проверяем в auraColor
////    if (isBlessed && healthPoints > 50 || isImmortal) {
////        println("GREEN")
////    } else {
////        println("NONE")
////    }
//    val auraColor = if (auraVisible)
//        "GREEN"
//    else
//        "NONE"
//    println(auraColor)

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

//// рефакторинг if в when
//    val healthStatus = when (healthPoints) { // можно состоянию сразу присвайвать условие . Почемув консоли пишет котлин юнит?
//        100 -> "$name is in excellent condition!"
//     in 90..99 ->  "$name has a few scratches"
//        in 75..89 -> if (isBlessed) {
//            "has some minor wounds but is healing quite quickly!"
//        } else {
//           "$name has some minor wounds."
//        } // можно убрать фигурные скобики вообще
//      in 15..74 -> "$name  looks pretty hurt."
//        else -> "$name is in awful condition!"
//    }
    // Состояние игрока
//    println("$name + $healthStatus ")

    // рефакторинг if в when


    // рефакторинг when в функцию (она за мэйном ниже)
//    val healthStatus = formatHealthStatus(healthPoints, name, isBlessed)
//    println(healthStatus)



    // задание !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    val karma = (Math.random().pow((healthPoints) / 100.0) * 20 ).toInt()
     val auraColor =  when (karma){
         in 0..5 -> "red"
         in 6..10 -> "orange"
         in 11..15 -> "purple"
         in 16..20 -> "green"
         else -> "dead"
     }
    println(auraColor)

    // дз надо сделать
    // Состояние игрока перед рефакторингом
    // println("(Aura: $auraColor) " +
    // "(Blessed: ${if (isBlessed) "YES" else "NO" })")
    // println("$name $healthStatus")
    //И создает следующий вывод:
    //(Aura: GREEN) (Blessed: YES)
    // Madrigal has some minor wounds but is healing quite quickly!
    //строка
    //val statusFormatString = "(HP)(A) -> H"
    //должна выводить состояние игрока как:
    //(HP: 100)(Aura: Green) -> Madrigal is in excellent condition!

     //рефакторинг в функцию чуть ниже
    //printPlayerStatus(auraColor, isBlessed, name, healthStatus)

            // castFireball(5)  // еслиесть Player класс то её убираем

//    val greetingFunction = { playerName: String, numBuildings: Int ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"    }
//    println(greetingFunction("Guyal", 2))
//    runSimulation("Guyal", greetingFunction)

    //добавили run для configureGreetingFunction() функции
    runSimulation()

    var beverage = readLine()?.capitalize() // вызвать поератор в любом случае - !!capitalise
    //   beverage = null
    println(beverage)

    //проверка если значение не равно
//    var beverage = readLine()
//    //   beverage = null
//    if (beverage != null) {
//        beverage = beverage.capitalize()
//    } else {
//        println("I can't do that without crashing - beverage was null!")
//    }


    //безопасный вывод с let
//    var beverage = readLine()?.let {
//        if (it.isNotBlank()) {
//            it.capitalize()
//        } else {
//            "Buttered Ale"
//        }

    val beverageServed: String = beverage ?: "Buttered Ale" // элвис - если операнд слева null выполнить операцию справа
    println(beverageServed)
}
fun runSimulation() {
    // configureGreetingFunction настраивает другую функцию
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}


// добавили inline за место вызова в main runSimulation
// Чтобы получить сслыку на функцию, используйте оператор :: с именем этой функции.
//inline fun runSimulation(playerName: String,
//                         costPrinter: (Int) -> Unit,
//                         greetingFunction: (String, Int) -> String) {
//    val numBuildings = (1..3).shuffled().last() // Случайно выберет 1, 2 или 3
//    costPrinter (numBuildings)
//       println(greetingFunction(playerName, numBuildings)) }
////добавили принт для вывода стоимости строительства зданий
//fun printConstructionCost(numBuildings: Int) {
//    val cost = 500
//    println("construction cost: ${cost * numBuildings}")
//}



//fun runSimulation(playerName: String, greetingFunction: (String, Int) -> String) { // можно в параметрах писать сразу инициализацию int = 1
//    val numBuildings = (1..3).shuffled().last() // Случайно выберет 1, 2 или 3
//     println(greetingFunction(playerName, numBuildings)) }

class Weapon(val name: String)
class Player(_name: String,
            var _healthPoints: Int = 100,  // добавление значения по умолчанию для того что бы можно было создавать констр-р с аргуметом и без
            val _isBlessed: Boolean,
            private val _isImmortal: Boolean) : Fightable { //реализация интерфейса фаила creature.kt  Щелкните правой кнопкой мыши на Player и выберите Generate…→ Implement Methods... и затем в диалоговом окне Implement Members (рис. 16.1) выберите direCount, diceSides и attack.
    var name = "Madrigal"
        get() = "$ field.capitalize() } of $hometown"
        private set(value) {
            field = value.trim()
        }

//    override val diceCount: Int
//        get() = TODO("Not yet implemented")
//    override val diceSides: Int
//        get() = TODO("Not yet implemented")
//
//    override fun attack(opponent: Fightable): Int {
//        TODO("Not yet implemented")
//    }
    //chn316 удаление заглушек туду
    override val diceCount: Int = 3

    override val diceSides: Int = 6

    override fun attack(opponent: Fightable): Int {
        val damageDealt = if (isBlessed) {  //316
            damageRoll * 2
        } else {
            damageRoll
        }
        opponent.healthPoints -= damageDealt
        return damageDealt
    }


        val health = 100 // сначала должна быть инициализация а затем методы
    init {
        val healthBonus = health.times(3)
    }



   val hometown = lazy {selectHomeTown()} // город где родился игрок //cтр258
    //val hometown = ""
    var currentPosition = Coordinate(0, 0) //координаты фаила navigation

    class PlayerScore(val experience: Int, val level:Int ){
        operator fun component1() = experience
        operator fun component2() = level
    }
//    val (experience, level) = PlayerScore(1250, 5)  // стр296 куда это?


    private fun selectHomeTown() = File("data/towns.txt") // нету фаила
            .readText()
            .split("\n")
            .shuffled()
            .first()

//constructor(name: String) : this(name,
//healthPoints = 100,
//isBlessed = true,
//isImmortal = false) }  // опчему в конструкторе всё красное?
//    if (name.toLowerCase() == "kar") healthPoints = 40
//}

    //    var weapon: Weapon? = Weapon("Ebony Kris")  // код может быть исправлен в другом месте что может привести к ошибке null
//    fun printWeaponName() {
//        if (weapon != null) {
//            println(weapon!!.name)
//        }
//    }

//    open class Weapon(val name: String, val type: String)
//    println(Weapon("ebony kris", "dagger") == Weapon("ebony kris", "dagger")) //    false
//
open class Weapon(val name:String, val type: String) {   // 306??
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        if (name != other.name) return false
        if (type != other.type) return false
        return true
    }
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }


    private var weapon: Weapon? = Weapon("Ebony Kris")
    fun printWeaponName() { // используем also чтобы исклбючить ошибку null
        weapon?.also {
            println(it.name)
        }
    }

//    init {     // обозначили что игрок не может начать игру если 0 процентов
//        require(healthPoints > 0, { "healthPoints must be greater than zero." })
//        require(name.isNotBlank(), { "Player must have a name." })
//    }



//    var healthPoints = 89
//    var isBlessed = true
//    val isImmortal = false

    private fun castFireball(numFireballs: Int = 2) = // скобки {} можно убрать если есть в конце оператор =
        println("A glass of Fireball springs into existence.")

    fun printPlayerStatus(auraColor: String, isBlessed: Boolean, name: String, healthStatus: String) {
        println("(Aura: $auraColor) " +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})")
        println("$name $healthStatus")
    }

    // как работает функция
    fun formatHealthStatus(healthPoints: Int, name: String, isBlessed: Boolean): String {
        val healthStatus = when (healthPoints) { // можно состоянию сразу присвайвать условие . Почемув консоли пишет котлин юнит?
            100 -> "$name is in excellent condition!"
            in 90..99 -> "$name has a few scratches"
            in 75..89 -> if (isBlessed) {
                "has some minor wounds but is healing quite quickly!"
            } else {
                "$name has some minor wounds."
            }
            in 15..74 -> "$name  looks pretty hurt."
            else -> "$name is in awful condition!"
        }
        return healthStatus
    }

}

// класс в узком поле видимости
class JazzPlayer {
    fun acquireMusicalInstrument() {
        val instrumentName: String
        instrumentName = "Oboe"
    }
}

class Player2(_name: String, val health: Int) {
    val race = "DWARF"
    var town = "Bavaria"
    val name = _name
    lateinit var alignment: String  // lateinit откладывает инициализацию на потом . Это делать не желательно .
    fun determineFate() {
        alignment = "Good"
    }
    private var age = 0
    init {
        println("initializing player")
        alignment = "GOOD"
    }
    constructor(_name: String) : this(_name, 100) {
        town = "The Shire"
    }


    fun proclaimFate() {
        if (::alignment.isInitialized) println(alignment) // метод isInitialized для проверки факта переменных под lateinit
    }
}

class Sword(_name: String) {
    var name = _name
        get() = "The Legendary $field"
        set(value) {
            field = value.toLowerCase().reversed().capitalize()
        }
}

open class Room(val name: String) {   // open - чтобы класс можно было унаследовать
    protected open val dangerLevel = 5
    var monster: Monster? = Goblin() // добавление монстра 321

    fun description() = "Room: $name\n" +
            "Danger level: $dangerLevel\n" +
            "Creature: ${monster?.description ?: "none."}"

    open fun load() = "Nothing much to see here..."

    //room is Room // проверка является ли room экземпляром класса . Почему ошибка?
    //room is TownSquare
}

class TownSquare : Room("Town Square") {
    override val dangerLevel = super.dangerLevel - 3 // стр269???? ссылка на уровень опасности суперкласса  // переопределение метода load класса room
    private var bellSound = "GWONG"  // final запрещает возможность переопределения функции

final override fun load() =
        "The villagers rally and cheer as you enter!\n${ringBell()}"


    private fun ringBell() = "The bell tower announces your arrival. $bellSound"

    var townSquare = TownSquare()
//    townSquare is TownSquare  // проверка является ли таунсквер экземпляром класса
    var className = when(townSquare) {  // Проверка типа в ветвлении с условием (REPL) 274
        is TownSquare -> "TownSquare"
        is Room -> "Room"
        else -> throw IllegalArgumentException()
    }
    //print(className)

}

fun drawBlueprint(room: Room) {} // принимает класс Room в качестве параметра

fun printIsSourceOfBlessings(any: Any) {
    val isSourceOfBlessings = if (any is Player) {
        any._isBlessed
    } else {
        (any as Room).name == "Fount of Blessings"
    }
    println("$any is a source of blessings: $isSourceOfBlessings")
}

object Game {
    private val player = Player("Madrigal")
    private var currentRoom: Room = TownSquare()

    private var worldMap = listOf(    // построение карты мира 302
            listOf(currentRoom, Room("Tavern"), Room("Back Room")),
            listOf(Room("Long Corridor"), Room("Generic Room")))

    private fun move(directionInput: String) =  //302
            try {
                val direction = Direction.valueOf(directionInput.toUpperCase())
                val newPosition = direction.updateCoordinate(player.currentPosition)
                if (!newPosition.isInBounds) {
                    throw IllegalStateException("$direction is out of bounds.")
                }
        val newRoom = worldMap[newPosition.y][newPosition.x]
                player.currentPosition = newPosition
                currentRoom = newRoom
                "OK, you move $direction to the ${newRoom.name}.\n${newRoom.load()}"
            } catch (e: Exception) {
                "Invalid direction: $directionInput."
            }
    //321
    private fun fight() = currentRoom.monster?.let {
        while (player.healthPoints > 0 && it.healthPoints > 0) {
            slay(it)
            Thread.sleep(1000)
        }
        "Combat complete."
    } ?: "There's nothing here to fight."

    private fun slay(monster: Monster) {
        println("${monster.name} did ${monster.attack(player)} damage!")
        println("${player.name} did ${player.attack(monster)} damage!")

        if (player.healthPoints <= 0) {
            println(">>>> You have been defeated! Thanks for playing. <<<<")
            exitProcess(0)       // ф-я  которая заканчивает работу текущего экземпляра и игра заканчивается
        }
        if (monster.healthPoints <= 0) {
            println(">>>> ${monster.name} has been defeated! <<<<")
            currentRoom.monster = null
        }
    }

    init {
        println("Welcome, adventurer.")
        player.castFireball() //285
    }

    fun play() {
        while (true) {
            // Игровой процесс NyetHack
            println(currentRoom.description())
            println(currentRoom.load())
            // Состояние игрока
            printPlayerStatus(player)

            print("> Enter your command: ")
            println("Last command: ${readLine()}")
        }
    }

    private fun printPlayerStatus(player: Player) {
        println("(Aura: ${player.auraColor()}) " +    //285
                "(Blessed: ${if (player.isBlessed) "YES" else "NO"})")
        println("${player.name} ${player.formatHealthStatus()}")
    }

    private class GameInput(arg: String?) {
        private val input = arg ?: ""
        val command = input.split(" ")[0]
        val argument = input.split(" ").getOrElse(1, { "" })

        fun processCommand() = when (command.toLowerCase()) {
            "fight" -> fight()
            "move" -> move(argument)
            else -> commandNotFound()
        }
        private fun commandNotFound() = "I'm not quite sure what you're trying to do!"
    }

}

class PremadeWorldMap {
    companion object {     // обявление вспомогательного объекта с помощью companion
        private const val MAPS_FILEPATH = "nyethack.maps"
    fun load() = File(MAPS_FILEPATH).readBytes()
    }
}



//Если потребуется вызвать load еще где-нибудь в коде, вы сможете сделать это без создания экземпляра PremadeWorldMap, как показано ниже:
//PremadeWorldMap.load()















