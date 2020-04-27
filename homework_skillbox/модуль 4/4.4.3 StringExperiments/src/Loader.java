import java.util.Scanner;

import static java.lang.Character.*;
import static java.lang.Integer.parseInt;

public class Loader
{
    public static void main(String[] args) {
        String firstName;
        String lastName;
        String patronymic;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Фамилию Имя Отчество");
        String name = sc.nextLine();

        int spaceIndex = name.indexOf(' ');
        firstName = name.substring(0, spaceIndex);
        System.out.println("Имя: " + firstName);


        lastName = name.substring(spaceIndex, name.lastIndexOf(' '));
        System.out.println("Фамилия: " + lastName);

        int spaceIndex2 = name.lastIndexOf(' ');
        patronymic = name.substring(spaceIndex2 + 1);
        System.out.println("Отчество: " + patronymic);

//            for (int i = 0; i < name.length(); i++) {
//                if (isSpaceChar(name.charAt(i))) {
//                    if (i == 1){
//                        continue;
//                    }
//                    if (i == 2){
//                        return;
//                    }
//                    if (i > 2) {
//                        System.out.println("Количество слов ФИО должно быть три");
//                        break;
//                    }
//
//                }
//            }

//        boolean a;
//        if (a = isLowerCase(firstName.charAt(0))) {
//            System.out.println("Введите Имя с большой буквы");
//        }
//
//        boolean b;
//        if (b = isLowerCase(firstName.charAt(0))) {
//            System.out.println("Введите Фамилию с большой буквы");
//        }
//
//        boolean c;
//        if (c = isLowerCase(firstName.charAt(0))) {
//            System.out.println("Введите Отчество с большой буквы");
//        }

//        String lower;
//        boolean low = true;
//        for (int i = 0; i < name.toCharArray().length; i++) {
//            int index = name.substring(i).indexOf(' ') + i;
//            lower = name.substring(1 , index);
//            i = index;
//           for (int j = 0 ; j < lower.length(); j++ ){
//               //if (low == Character.isUpperCase(lower.charAt(j))) {
//               if (Character.isUpperCase(lower.charAt(j))) {
//                   System.out.println("Все буквы кроме первой в слове должны быть маленькими");
//                   low = false;
//               } else if (low = false){
//                   break;
//               } else {
//                   return;
//               }

//        String lower;
//        boolean low = true;
//        for (int i = 0; i < name.toCharArray().length; i++) {
//            int index = name.substring(i).indexOf(' ') + i;
//            lower = name.substring(0 , index);
//            i = index;
//            for (int j = 0 ; j < lower.length(); j++ ){
//
//                if (j == 0) {
//                    if (!low) {
//                        continue;
//                    }
//                    if (isLowerCase(lower.charAt(j))) {
//                        System.out.println("Все первые буквы должны быть большими");
//                        low = false;
//
//                    }
//                }
//
//                if (j > 0 ) {
//                    if (!low){
//                        continue;
//                    }
//                    if (isUpperCase(lower.charAt(j))){
//                        if (j == spaceIndex) {
//                            return;
//                        }
//                        System.out.println("Все буквы кроме первой должны быть маленькими");
//                        low = false;
//                    }
//                }
//
//                if (j == spaceIndex){
//                    if (isSpaceChar(name.charAt(i)) ) {
//                    }else if (spaceIndex == 1){
//                        continue;
//                    } else {
//                        System.out.println("Слов в ФИО должно быть три");
//                    }
//                }
//            }
//        }

//        вариант для разбора
//        boolean first = true;   //проверка первой буквы
//        boolean second = true;
//        boolean valid = true;   //результат проверки
//        int countSpace = 0;     //счетчик пробелов
//        char[] mas = name.toCharArray(); //для краткости кода
//        for (int i = 0; i < mas.length; i++) {
//            if (first && Character.isUpperCase(mas[i])) { //если первый символ в слове и загллавная - все ОК
//                first = false;
//                continue;   //больше нам данный символ можно не проверять, продолжаем цикл
//            } else if (first && !Character.isUpperCase(mas[i])) { //если первый символ не заглавная - ошибка
//                if (!valid) {
//                    continue;
//                }
//                System.out.println("Первая буква слова должна быть заглавной!");
//                valid = false;
//                continue;
//            }
//
//
//            first = true;
//            if (mas[i] == ' ') { //если попался пробел - то считаем количество и следующую букву ждем заглавную
//                countSpace++;
//                if (countSpace > 2) { //много пробелов - ошибка
//                    System.out.println("Слишком много пробелов");
//
//                    //выход из цикла
//                } else {
//                    continue;   //если пробелов меньше двух - продолжаем цикл
//                }
//
//                valid = true;
//                if (!Character.isLowerCase(mas[i])) {
//                    //проверяем все остальные буквы
//                    System.out.println("Неверный ввод");
//                    valid = false;
//                    break;//выход из цикла
//                }
//            }
//        }
//            if (countSpace == 1) {
//                System.out.println("Слов должно быть 3");
//            }
//            if (valid && countSpace == 2) {      //если проверка успешная - разбиваем и выводим на печать
//                System.out.println("Верный ввод!");
//                System.out.println(name.substring(0, name.indexOf(' ')));
//                System.out.println(name.substring(name.indexOf(' ') + 1, name.lastIndexOf(' '))); //индекс + 1 чтобы не захватить сам пробел
//                System.out.println(name.substring(name.lastIndexOf(' ') + 1));
//            }





//            patronymic = String.valueOf(Character.isLowerCase (1));//А здесь вы берете символ с кодом 1 (по кодовой таблице), проверяете на то что это маленькая буква, получаете boolean, и это переводите в строку. Ответ будет скорее всего false
//            System.out.println(patronymic);


        //https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html

        //char ch = ' '
        // Character c = new Character (ch)
        //int i = Character.digit('A',16) 16я система исчисления
        //boolean b = Character.isDefined ('1'); определяется юникод цифры
        //b = Character.isLowerCase ('A'); проверяем ловеркейс b
        //b = Character.isJavaIdentifierStart ('+'); может ли символ начинать идентификатор или нет

//        isDigit(char ch)
//        Определяет, является ли указанный символ цифрой.

        //static boolean	isLetter(char ch)
        //Определяет, является ли указанный символ буквой.

        //static boolean	isLetter(int codePoint)
        //Определяет, является ли указанный символ (кодовая точка Unicode) буквой.

        //isSpaceChar(char ch)
        //Определяет, является ли указанный символ пробелом в Юникоде.

        //catch (NullPointerException e){
        //        System.out.println("Введите Имя Фамилию и Отчество");

//        } catch (NullPointerException e) {
//            if (lastName.length() < 1)   {
//                return;
//            }
//            System.out.println("Вы что-то не ввели");
//        }


        /**
         *         String firstName = full
         *         String lastName = fullName.substring(firstIndex+1, lastIndex);
         *         String otherName = fullName.substring(lastIndex+1);
         *
         * использовать методы индекс офф ласт индекс офф сабстринг и трим которые будут считать сумму заработков всех друзей
         *         System.out.println(text);
         *         text.indexOf(5); возвращает порядковый номер
         *         text.substring();
         *         int space = text.indexOf(' ');
         *         System.out.println(text.substring (0,space));
         *         System.out.println(text.substring (space + 1));
         *         substring(lastindexof("?"), length)
         *         int sumText = Integer.parseInt(String.valueOf(text));
         */


    }

}


