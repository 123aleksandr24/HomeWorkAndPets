import javafx.beans.Observable

//Уроки Kotlin | #20 Связанные списки

fun main() {
    Observable.create(subscriber -> {
        try {
            subscriber.onNext("Hello");
            subscriber.onCompleted();
        } catch (Exception e) {
            subscriber.onError(e)
        }
    });

    //операторы - то что подписывается на потоки данных
    fun filterEditText(): Unit {
        RxTextView
                .textChanges(searchEditText)
                .filter({ text -> text.length !== 0 })
    }

//трансофрмирующие операторы
fun trimAndFilterText(): Unit {
    RxTextView
            .textChanges(searchEditText)
            .map({ text -> text.toString().trim() })
            .filter({ text -> text.length() !== 0 })
}

    // комбинирующие операторы
    fun combineNetWorkingDb(searchText: String?): Unit {
        Observable
                .combineLatest(searchInlocalDb(searchText),
                        searchInRestApi(searchText))
    }

    //не забывайте отписываться !!
    fun networkRequest() {
        val subscription: Subscription = getUsers()
                .subscribe(users - > arrayOf < > (), error - > arrayOf < > ())
        subscription.unsubscribe()
    }


}