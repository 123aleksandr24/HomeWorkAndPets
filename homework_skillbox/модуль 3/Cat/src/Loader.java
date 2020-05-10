public class Loader
{
    //создаём котёнка
    public static Cat getKitten(double weight, String name, Color color)
    {
        Cat cat = new Cat(weight);
        cat.setName(name);
        cat.setCatColor(color);
        return cat;
    }

    public static void main(String[] args)
    {
        // двойная проверка на установку веса и имени котёнку и проверка самого метода getKiteen
        Cat kitten = getKitten(1100 , "kotya", Color.RED); //getKitten(1100 , "kotya", Color.RED)
        System.out.println(" Котёнка зовут: " + kitten.getName() + " он весит " + kitten.getWeight());
        kitten.setName("kot");
        kitten.drink((double) 50); // проверка на то что конструктор в классе Cat с переменными amount и др. работает
        System.out.println(" Котёнка зовут: " + kitten.getName() + " он весит " + kitten.getWeight());

////////взрываем и мяукаем до смерти (цикл ниже)
        Cat ponchik = new Cat();
        ponchik.setName ("Пончик");
        System.out.println(ponchik.getWeight() + ponchik.getStatus());
        for ( ;ponchik.getWeight() <= 9000; ) {
            ponchik.eat();
            System.out.println(" вес пончика: " + ponchik.getWeight() + " статус пончика " + ponchik.getStatus());
            }
        ponchik.eat(); //проверка System.out.println("Брату меньшему не удалось выжить после такого")
        System.out.println(" вес пончика: " + ponchik.getWeight() + " статус пончика " + ponchik.getStatus());

        Cat vasya = new Cat();
        System.out.println(vasya.getWeight() + vasya.getStatus());
        for ( ;vasya.getWeight() >= 1000 ; ) {
            vasya.meow();
            vasya.getStatus();
            System.out.println(" веси васи: " + vasya.getWeight() + " статус васи " + vasya.getStatus());
        }
        System.out.println(" веси васи: " + vasya.getWeight() + " статус васи " + vasya.getStatus());//окончательный статус вне цикла


        //проверка на установку цветов котам и установку веса
        Cat vasilisa = new Cat();
        System.out.println("Василиса весит сейчас: " + vasilisa.getWeight());
        vasilisa.setCatColor(Color.WHITE);
        System.out.println("Есть ли хвост без его установки?: " + vasilisa.hasTail()); // boolean по умолчанию false
        vasilisa.setWeight(2222);
        System.out.println("Василиса весит после: " + vasilisa.getWeight());
        System.out.println(vasilisa.getCatColor());

        //проверка наличия хвоста
        Cat manyanya = new Cat();
        manyanya.setTail();
        System.out.println("У кота есть хвост?: " + manyanya.hasTail());
        manyanya.setCatColor(Color.BLACK);
        System.out.println(manyanya.getCatColor());
        manyanya.deleteTail(); // удалили хвост
        System.out.println("А сейчас у кота есть хвост?: " + manyanya.hasTail());

        // двойная проверка конструктора с weight и метода setWeight
        Cat snezhok = new Cat(2300);
        System.out.println(" Вес Снежка " + snezhok.getWeight());
        snezhok.setCatColor(Color.WHITE_BLACK);
        snezhok.setWeight(2120);
        System.out.println(" Вес Снежка " + snezhok.getWeight());


        //проверка метода кормления и возврата съеденного значения даже после туалета
        Cat pushok = new Cat();
        System.out.println(" Вес Пушка до: " + pushok.getWeight());
        pushok.feed( 150);
        pushok.feed(120);
        pushok.pee();
        pushok.pee();
        pushok.pee();
        System.out.println(" Пушок съел: " + pushok.getEat() + " Вес Пушка после: " + pushok.getWeight());

        //проверка количества котов
        System.out.println(" Количество выживщих котов " + Cat.getCount());

        //клонируем котов и ещё одна проверка уставновки веса
       Cat petrushka = new Cat();
        System.out.println(petrushka.getName() + petrushka.getWeight() + petrushka.getCatColor());
       petrushka.setWeight(2100);
       petrushka.setName("Петрушка");
       petrushka.setCatColor(Color.BROWN);
        System.out.println(petrushka.getName() + petrushka.getWeight() + petrushka.getCatColor());

       Cat plushka =  new Cat() ;
       plushka.copyCat(petrushka);
       plushka.meow();
       System.out.println(plushka.getName() + plushka.getWeight() + plushka.getCatColor());

        Cat klushka = new Cat();
        System.out.println(klushka.getName() + klushka.getWeight() + klushka.getCatColor());
        klushka.setName("Клюшка");
        klushka.setCatColor(Color.WHITE);
        System.out.println(klushka.getName() + klushka.getWeight() + klushka.getCatColor());

        Cat podushka =  new Cat() ;
        System.out.println(podushka.getName() + podushka.getWeight() + podushka.getCatColor());
        podushka.getCopyCat(klushka);
        podushka.meow();
        System.out.println(podushka.getName() + podushka.getWeight() + podushka.getCatColor());
    }
}