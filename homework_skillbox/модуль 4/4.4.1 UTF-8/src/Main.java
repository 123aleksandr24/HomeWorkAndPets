public class Main {
    public static void main(String[] args) {
        //String text = "abcdefghijklmnopqrstuvwxyzабвгдеёжзийклмнопрстуфхцчшщьъэюя";
        //char c = 'R'; // text.charAt(0)
        //int code = c;
        //System.out.println(code);
        //распечатать коды всех латинских букв и заводно русских чтобы программа печатала буква номер
        //String textNumber = number.toString();
        //int endSum = 0;
        //for( int i = 0 ; i < textNumber.length() ; i++){ //задаем цикл для charAt который берет определённый символ и делаем так чтобы он не превышал длинну строки числа
        //    char text = textNumber.charAt(i) ; //берет инкрементный символ
        //    int sumText = Integer.parseInt(String.valueOf(text)); //преобразовывает строку в число
        //    endSum = endSum + sumText;

        String text = " ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЪЭЮЯабвгдеёжзийклмнопрстуфхцчшщьъэюя";
        for (int i = 0 ; i < text.length(); i++ ){
            char cha = text.charAt(i);
            int code = text.charAt(i);
            System.out.println(code + " " + cha);
        }
    }

}
