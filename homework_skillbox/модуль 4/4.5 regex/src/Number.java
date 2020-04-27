import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
    public static void main(String[] args) {
        // +7 903 123-45-67
        // String digitWithSpace = text.replaceAll("[^0-9\\s]","");
        //String phone = "8 (908) 128 45 67";
        //System.out.println(phone.replaceAll("[^0-9],[^.]" , "+7 903 123-45-67"));
        System.out.println("введите номер телефона");
        Scanner sc = new Scanner(System.in);
        String phone = sc.nextLine();

        System.out.println(phone.replaceAll("(\\+\\d{0,2})|\\d(8)(\\d{3})(\\d{3})(\\d{4})", "\\+$1($2) $3-$4"));
        //Pattern p = Pattern.compile("");
        //Matcher m = p.matcher("");

        //пример
        String number = "799943 34-343";
        System.out.println(number.replaceAll("(\\d{0,2})(\\d{3})(\\d{3})(\\d{4})", "\\+$1($2) $3-$4")); //вывод на печать

    }


}
