public class Main
{
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;
        int number = 1736;
        int sum = sumDigits(number);
        System.out.println(sum);
    }
    private static Integer sumDigits(Integer number) {
        String textNumber = number.toString(); //преобразовываем число в строку

        int endSum = 0;
        for( int i = 0 ; i < textNumber.length() ; i++){ //задаем цикл для charAt который берет определённый символ и делаем так чтобы он не превышал длинну строки числа
            char text = textNumber.charAt(i) ; //берет инкрементный символ
            int sumText = Integer.parseInt(String.valueOf(text)); //преобразовывает строку в число
            endSum = endSum + sumText;
            //System.out.println(endSum);
        }
        //@TODO: write code here
        return endSum;

        //Задание -        реализовать метод sumDigits(сумма чисел числа) используя методы ниже
        //Integer -        класс обёртка
        //.toString()      представляет объект в  виде строки
        // .charAt()       позволяет из строки взять один символ используя номер позиции
        // .length()       возвращает длинну строки
        //System.out.println(); - скрыто вызывает метод toString()
        // int b = Integer.parseInt(text) принимает перемненную текстового типа а на выходе получаем целое  число
        //Integer.compare(a,b) - сравнивает два целых числа: 0 - равны ;-1 - первое меньше; 1 - первое больше.
        //.concat()        объединяет строки
        //.trim            удаляет пробелы по бокам
        //.contains ("a")  проверяет есть ли такой символ
        //.toLowerCase     приводит к нижнему регистру
        //.toUpperCase     приводит в верхнему регистру
        //.toUpperCase.contains("АБВ") cвязка чтобы найти буквы
        //.substring       позволяет получить подстроку от номера символа

    }
}

