import java.util.concurrent.Flow;

public class Observable {


    public static void main(String[] args) {

    }
     Observable.create(subscriber -> {
        try {
            subscriber.onNext ("Hello");
            subscriber.onCompleted();
        }  catch (Exception e){
            subscriber.onError(e)
        }
    })

    public void filterEditText () {
         RxTextView
                 .textChanges(searchEditText)
                 .filter(text -> text.length != 0);
    }

    public void trimAndFilterText () {
        RxTextView
                .textChanges(searchEditText)
                .map(text -> text.toString().trim())
                .filter(text -> text.length() != 0);
    }

    // комбинирующие операторы
    public void  combineNetWorkingDb(String searchText) {
         Observable
                 .combineLatest (searchInlocalDb (searchText),
                         searchInRestApi(searchText));
    }

    //не забывайте отписываться !!
    public void networkRequest () {
         Subscription subscription = getUsers()
                 .subscribe(users - > {
                         //display users
                 } , error - > {
                 })
         subscription.unsubscribe();
    }

    public void unsubscribeUse () {
        Flow.Subscription subscription = null, subscription1 = null;
        CompositeSubscription cs = new CompositeSubscription;

        cs.add(subscription);
        cs.add(subscription1);

        cs.unsubscribe();
        cs.clear();
    }

    //шедулинг потоки
   // .subscribeOn(Schedulers.io())

    // обзёрвон можно указывать везде
    //.observeOn(AndroidSchedulers.mainThread())

}
