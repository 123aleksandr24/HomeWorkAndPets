import java.util.Arrays;

public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        String space = " ";

        //первое решение
        String zp1 = text.substring(15,19);
        String zp2 = text.substring(35,39);
        String zp3 = text.substring(56,61);

        int zps1 = Integer.parseInt(zp1);
        int zps2 = Integer.parseInt(zp2);
        int zps3 = Integer.parseInt(zp3);
        System.out.println(zps1+zps2+zps3);

        // вариант два сразу
        //int zpV = Integer.parseInt(text.substring(text.indexOf("тал") + 4, text.indexOf(" руб")));
        }
            //lastName = name.substring(spaceIndex, name.lastIndexOf(' '));
        //int code = text.charAt();
        // ютф для цифр от 0 до 9
        //32 - пробел
        //49 1
        //50 2
        //51 3
        //52 4
        //53 5
        //54 6
        //55 7
        //56 8
        //57 9
        //48 0
        //String text2 = (spaceIndex, );

}

