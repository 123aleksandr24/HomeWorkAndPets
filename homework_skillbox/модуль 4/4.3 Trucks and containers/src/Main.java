import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //грузовики контейнеры  и ящики
        //грузовик => 12 контейнеров
        //контейнер => 27 ящиков

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сколько ящиков гуманитарной помощи требуется ");
        int scAll;
        scAll = setAll(scanner.nextInt());//уставнавливаем через сеттер значение переменно равной введённому nextInt в консоли

        int scTruck;
        scTruck = (scAll / Variables.container / Variables.box) + 1;
        if(scAll % (Variables.container * Variables.box) == 0){ // делаем исключение если число кратное то на единицу меньше
            scTruck--;
        }
        int truckNumber = 0;

        int scContainer;
        scContainer = scAll / Variables.box + 1;
        if(scAll % Variables.box == 0) {
            scContainer--;
        }
        int containerNumber = 0;

        int boxNumber = 0;

        System.out.println("Нам потребовалось грузовиков: " + scTruck);
        System.out.println("Контейнеров в грузовиках: " + scContainer);
        System.out.println("ящиков " + scAll);

        for (int i = 1; i <= scTruck; i++) {
                truckNumber++;
                System.out.println("грузовик: " + truckNumber);

            for (int j = 1; j <= Variables.container; j++) {
                if (containerNumber < scContainer) {
                    containerNumber++;
                    System.out.println("контейнер: " + containerNumber);
                }

                for (int k = 1; k <= Variables.box; k++) {
                    if (boxNumber < scAll) {
                        boxNumber++;
                        System.out.println("ящик: " + boxNumber);
                    }
                }
            }
        }
    }

    public static int setAll(int number) {
        Variables.all = number ;
        return number;
    }
}
