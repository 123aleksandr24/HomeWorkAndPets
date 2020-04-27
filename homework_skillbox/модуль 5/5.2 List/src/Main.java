import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void foo(ArrayList<String> todoList) {

    }
    //private void setN(Integer N) {
    //}

    public static void main(String[] args) throws IOException {

        ArrayList<String> todoList = new ArrayList<>(){{
            System.out.println("Список ArrayList");
            add("Что то там добавили");
            remove("Сразу удалили, но чёт не то что нужно");
            add ("Добавили ещё");
        }};
        todoList.add("Что то там добавили дубль два");
        todoList.add ("Добавили ещё дубль два");
        todoList.remove("Что то там добавили дубль два"); //удалили то что нужно
        System.out.println(todoList + " Что то там добавили дубль два - удалён. Все норм работает!!!");

        System.out.println("Выберите команду:\n\n" + " LIST - список\n "  + "ADD_N - добавить элемент где 'N' - номер элемента\n " +
                "REMOVE_N - удалить элемент 'N' - номер элемента\n " + "EXIT - выйти из выбора");

        Scanner forArray = new Scanner(System.in);
        String ArrayList = forArray.nextLine();

        //int N = forArray.nextInt();
        //int i;

        if (ArrayList.equals("LIST")){

            foo(todoList);
            System.out.println("блаблабла");
        }
        if (ArrayList.equals("ADD_") ){

            int i = 0;
            todoList.add(String.valueOf(i));
        }
        if (ArrayList.equals("REMOVE_")){
            int i = 0;
            todoList.remove(String.valueOf(i));
        }
        if (ArrayList.equals("EXIT")){
            return;
        }











//        System.out.println("Выберите команду:\n\n" + " 1 - список\n "  + "2 - добавить элемент\n " +
//                "3 - удалить элемент\n " + "4 - выйти из выбора");
//
//
//        //int a = forArray.nextInt();
//
//        if (N==1){
//            System.out.println("Вот вам список");
//        }
//        if (N==2){
//            //System.out.println(get(todoList));
//            System.out.println("Вы что-то добавили");
//        }
//        if (N==3){
//            System.out.println("Вы что-то удалили");
//        }
//        if (N==4){
//            System.out.println("Вы вышли из выбора");
//        }


//        Scanner consoleScanner = new Scanner(System.in);
//        //String func = sc.nextLine();
//
//        //просто стринговый сканнер
//        Scanner stringScanner = new Scanner ("welcome to skillbox.com - запись стрингов");
//        String welcome = stringScanner.nextLine();
//        System.out.println(welcome);
//
//////////фаил который создали в папке src
//        File file = new File("C:\\Users\\aleks\\IdeaProjects\\задания skillbox\\List\\src\\ScannerTest.txt");
//        // пример - (" C:\\Users\\aleks\\OneDrive\\157115-aleni.jpg"); пример запись долгого пути. НЕ ОТКРОЕТ НА ДРУГОМ КОМПЕ!!! Вставить путь папки src проекта.
//        Scanner fileScanner = new Scanner(file);
//        file = new File(fileScanner.nextLine());
//        System.out.println(file + " Фаил через долгии путь ");
//
//        FileReader fileReader = new FileReader
//                (".//src//ScannerTest.txt"); //обратная форма экранирования
//        Scanner fileReaderScanner = new Scanner(fileReader);
//        System.out.println(fileReader + " Фаил через быстрый путь. Но что за ошибка в консоли?");
//
//
//        //FileReader fileList = new FileReader ("todoList");
//        //Scanner List = new Scanner(fileList);
//        //System.out.println(List + " Фаил через быстрый путь. Но что за ошибка в консоли?");
//
//        //fileScanner.useDelimiter(",");//добавили в ScannerTest и проверяем в while
//        while (fileReaderScanner.hasNextLine()){    // прорбегается по строкам фаила
//            System.out.println(fileReaderScanner.nextLine());
//        }
//        System.out.println(fileReaderScanner.useDelimiter(",")); // что не то?
//        System.out.println(fileScanner.findInLine("Hello")); // почему находит нулл ? как это связано с path?
//        fileReaderScanner.close(); // закрывает сканер
//
//        for (String item: todoList){
//            System.out.println(item); // перебирает списки элементов
//        }
//
//        //да, вечный цикл for(;;) в нем через if(сканер .equals команда)
//
//        //foo(todoList); // метод на интерфейсах
//
//        System.out.println("Список ArrayList через while");
//        int i = 0;
//        while (i < todoList.size()) {
//            i++;
//            //либо достать индексы либо преобарзоваь i в чар
//            //System.out.println(todoList.get(i)); // почему не хочет получать инкрементный символ? какая должна быть длинна?
//            System.out.println(todoList.get(0) ); // а конкретный элемент получает
//            }
//
//        System.out.println("Проверяем что удалил итератор");
//        Iterator<String> iterator =  todoList.iterator();
//        while (iterator.hasNext()){
//            iterator.next();
//            iterator.remove();
//            System.out.println(todoList);
//        }
//
//
//        System.out.println("проверка outputstream , введите числа в количестве не больше 5ти");
//        ByteArrayOutputStream f = new ByteArrayOutputStream(10);
//        while (f.size() != 5){  //пока число не равно 5
//            f.write(System.in.read());
//        }
//        System.out.println(f.toString()); // содержимое преобразуется в строку и выводится
//
//        //("C:\\Users\\aleks\\IdeaProjects\\задания skillbox\\List\\src\\ScannerTest.txt") FileForOutputStream.txt (".//src//ScannerTest.txt")
//        OutputStream list = new OutputStream() {
//            @Override
//            public void write(int b) throws IOException {
//            }
//        };
//        f.writeTo(list);
//        list.close();
//
//        String func;
//        System.out.println("add - добавить элемент " + "remove - удалить элемент " + "see - показать весь список ");
//        do {
//            func = consoleScanner.nextLine();
//            System.out.println("Добавьте хоть что-нибудь");
//        } while (!"add".equals(func));
//        // do {
//       //    func = sc.nextLine();
//       //    System.out.println("Введите что хотите удалить");
//       // } while (func != "remove");
//       // System.out.println(todoList);
    }
}

/**
 * ADD Какое-то дело
 * LIST
 * 0 - Перенести все книги и ч
 */

// todoList.contain(person) проверяет наличие персоны
// todoList.toArray привести коллекцию к массиву
//todoList.addAll() добавляет другую коллекцию с  определённого индекса
//todoList.iterator доступ к элементам листа