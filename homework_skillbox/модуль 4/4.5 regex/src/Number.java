import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
    public static void main(String[] args) {
//        formatPhone("+7 903v123-45-67");
//        formatPhone("8 (905) 6738722");
//        formatPhone("905 45623-11");
        // String digitWithSpace = text.replaceAll("[^0-9\\s]","");
        //String phone = "8 (908) 128 45 67";
        //System.out.println(phone.replaceAll("[^0-9],[^.]" , "+7 903 123-45-67"));
        //System.out.println("введите номер телефона");
        Scanner sc = new Scanner(System.in);
        String phone ;
        //formatPhone(phone);

       //for (; ; ) {
            System.out.println("введите номер телефона");
            phone = sc.nextLine();
            if (phone.matches("[0-9]")) {
                System.out.println("Есть совпадение!");
                formatPhone(phone);
                //break;
            } else {
                System.out.println("Совпадения нет");
            }
        //}



//        Pattern p = Pattern.compile("");
//        Matcher m = p.matcher("");

        //пример
        //String number = "79994334343";
        //System.out.println(number.replaceAll("(\\d{0,2})(\\d{3})(\\d{3})(\\d{4})", "\\+$1($2) $3-$4-$5"));

    }

    private static void formatPhone(String phone) {
        //for (int i = 0; i < phone.length(); i++) {
            //System.out.println(number.charAt(i));
            //System.out.println(number.replaceAll("(\\d{0,2})(\\d{3})(\\d{3})(\\d{4})", "\\+$1($2) $3-$4-$5"));
            if (phone.length() == 10) {
                phone = "7" + phone;
                //System.out.println("+7(" + phone.substring(0,3) + ") " + phone.substring(3,6) + "-" + phone.substring(7,9) + "-" + phone.substring(8,10));
            } else if (phone.length() == 11) {
                phone = "7" + phone.substring(1);
                //System.out.println("+7(" + phone.substring(1,4) + ") " + phone.substring(4,7) + "-" + phone.substring(7,9) + "-" + phone.substring(9,11));
            } else {
                System.out.println("Неверный формат номера");
                //   return;
            //}
            //vvvSystem.out.println("+7(" + phone.substring(1,4) + ") " + phone.substring(4,7) + "-" + phone.substring(7,9) + "-" + phone.substring(9,11));
            //System.out.println(phone.replaceAll("(\\d{0,2})(\\d{3})(\\d{3})(\\d{4})", "\\+$1($2) $3-$4"));
        }

    }
}



