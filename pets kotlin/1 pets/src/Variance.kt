class Barrel<out T>(val item: T)

fun main(args: Array<String>) {
    var fedoraBarrel: Barrel<Fedora> =
            Barrel(Fedora("a generic-looking fedora", 15))
    var lootBarrel: Barrel<Loot> = Barrel(Coin(15)) //336

   // var loot: Loot = Fedora("a generic-looking fedora", 15)

    lootBarrel = fedoraBarrel //338  и перечитать с 336


    val myFedora: Fedora = lootBarrel.item
}

public interface List<out E> : Collection<E>
