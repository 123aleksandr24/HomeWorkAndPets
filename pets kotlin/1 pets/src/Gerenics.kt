class LootBox<T : Loot> (vararg item: T) {  // vararg позволяет передавать произвольное количество  аргументов в конструктор item стал массивом элементов
    var open = false
    private var loot: Array<out T> = item //334

    operator fun get(index: Int): T? = loot[index].takeIf { open }


    fun fetch(item: Int): T? {
        return loot[item].takeIf { open }
    }


    fun <R> fetch(item:Int, lootModFunction: (T) -> R): R? {  // стало можно возврашать как коины так и шляпы
        return lootModFunction(loot[item]).takeIf { open }
    }

}

open class Loot(val value: Int)

class Fedora(val name: String, val value: Int) // награда шляпа

class Coin(val value: Int)   // награда монета

fun main(args: Array<String>) {
    val lootBoxOne: LootBox <Fedora> = LootBox(Fedora("a generic-looking fedora",
            15),
            Fedora("a dazzling magenta fedora", 25)) // двасундука для хранения шляп и монет //fedora 334
    val lootBoxTwo: LootBox<Coin> = LootBox(Coin(15))
//запуск обощенной функции fetch
    lootBoxOne.open = true   // открытие сундука 1
    lootBoxOne.fetch(1)?.run {
        println("You retrieve $name from the box!")
    }
    // Передача функции преобразования награды в качестве аргумента
    val coin = lootBoxOne.fetch(0) {
        Coin(it.value * 3)
    }
    coin?.let { println(it.value) }

    val fedora = lootBoxOne[1]
    fedora?.let { println(it.name) }
}
