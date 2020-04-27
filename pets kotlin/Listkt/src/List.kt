//Уроки Kotlin | #20 Связанные списки

class List (var iData : Int , var dData : Double ){
    var next: List? = null

    fun displayLink () {
        println("{$iData,$dData}")
    }
}

class LinkList {
    private var first: List? = null

    init{
        first = null
    }

    val isEmpty: Boolean
    get() = first == null

    fun insertFirst(id:Int, dd: Double){
        var  newList = List(id,dd)
        newList.next = first
        first = newList
    }

    fun deleteFirst () : List{
        val temp = first
        first = first!!.next
        return temp!!
    }

    fun displayList () {
        println ("List(first --> last): ")
        var current = first
        while (current != null){
            current.displayLink()
            current = current.next
        }
        println()
    }
}

fun main(){
    var  theList = LinkList();
    theList.insertFirst(22,2.99)
    theList.insertFirst(33,45.99)
    theList.insertFirst(44,65.99)
    theList.insertFirst(55,63.99)
    theList.insertFirst(66,23.99)
    theList.insertFirst(77,13.99)

    theList.displayList()

    while (!theList.isEmpty){
        var aLink : List = theList.deleteFirst()
        println("Deleted ${aLink.displayLink()}")
    }

    theList.displayList()
}

