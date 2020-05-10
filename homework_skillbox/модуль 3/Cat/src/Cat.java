public class Cat
{
    public static final int EYES = 2;
    public static final double MIN_WEIGHT_CAT = 1000;
    public static final double MAX_WEIGHT_CAT = 9000;
    private double originWeight;
    private double weight;
    private Double amount;
    private Double eat = 0.0;

    private double minWeight;
    private double maxWeight;
    private String name;
    private static int countCat = 0;
    private static int countAll;
    private boolean tail = true; //иначе по умолчанию коты не имеют хвостов (false)

    //проверка хвоста
    public boolean hasTail(){
        return tail;
    }

    //уставновка хвоста
    public void setTail() {
        this.tail = true;
    }

    //удаление хвоста
    public void deleteTail(){
        this.tail = false;
    }

    ///создание копии
    public void copyCat (Cat original)
    {
        this.weight = original.weight;
        this.name = original.name;
        this.catColor = original.catColor;
        this.minWeight = original.minWeight;
        this.maxWeight = original.maxWeight;
        this.amount = original.amount;
        this.eat = original.eat;
        this.originWeight = original.originWeight;
    }
    //
    public Cat getCopyCat()
    {
        Cat original = new Cat ();
        original.weight = this.weight;
        original.name = this.name;
        original.catColor = this.catColor;
        original.minWeight = this.minWeight;
        original.maxWeight = this.maxWeight;
        original.amount = this.amount;
        original.eat = this.eat;
        original.originWeight = this.originWeight;
        return original;
    }

    public Cat() {
        countCat++;
        countAll = countCat;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

    }

    public Cat(double weight) {
        this();
        this.weight = weight;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public  String getName()
    {
        return name;
    }

    //когда коты живы
    public boolean isAlive() {
        return  weight > minWeight && weight < maxWeight;
    }

    public static int getCount() {
        return countAll;
    }

    public void meow() {
        if (isAlive()) {
            weight = weight - 1;
            System.out.println("Meow");
            if (!isAlive()) {
                countCat--;
            }
        } else  {
            System.out.println("Брату меньшему не удалось выжить после такого");
        }
    }

    public void feed(double amount)
    {
        if (isAlive()) {
            eat = eat + amount;
            weight = weight + amount;
            if (!isAlive()) {
                countCat--;
            }
        } else {
            System.out.println("Брату меньшему не удалось выжить после такого");
        }
    }

    public void eat() {
        if (isAlive()) {
            weight = weight + 100;
            if (!isAlive()) {
                countCat--;
            }
        } else {
            System.out.println("Брату меньшему не удалось выжить после такого");
        }
    }

    public double getEat()
    {
        return eat;
    }

    public void pee() {
        if (isAlive()) {
            weight = weight - 100;
            System.out.println("Кот сходил куда надо - вес уменьшился на 100г ");
            if (!isAlive()) {
                countCat--;
            }
        } else {
            System.out.println("Брату меньшему не удалось выжить после такого");
        }
    }

    public void drink(Double amount) {
        if (isAlive()) {
            weight = weight + amount;
            if (!isAlive()) {
                countCat--;

            }
        } else {
            System.out.println("Брату меньшему не удалось выжить после такого");
        }
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight ;
    }

    private Color catColor;

    public Color getCatColor() {
        return catColor;
    }

    public void setCatColor(Color paint) {
        this.catColor = paint;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}
