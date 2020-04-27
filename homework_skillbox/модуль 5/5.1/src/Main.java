import java.util.*;

import static java.lang.String.valueOf;
import static java.util.Collections.reverse;
//import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать где сидит фазан";
        String[] colors = text.split(",?\\s+");

        // Stack stack = new Stack ();
        String[] array = new String[7];
        //Queue q = new Queue() ;
        //String[] reverse;

        for (int i = 0; i < colors.length; i++) {
            //array[i] = colors[i];
            array[i] = colors [(colors.length - 1) -i];
            //System.out.println(colors [(colors.length - 1) -i] );
            System.out.println(Arrays.toString(array));

            //colors[i] = array[i];
            //Arrays.sort(colors);
            //Collections.reverse(Arrays.asList(colors));

            // System.out.println(colors);
            //reverse[i] =  colors[i];
            //System.out.println(array2);
            //for (int j = 0 ; j < reverse.length ; j++){
            //System.out.println(reverse[j]);
            //array.addAll(Arrays.asList(colors));
            //Collections.rotate() ???

            //stack.push();
            //System.out.println(array);
        }
    }
}
//push() — добавляет элемент на верх стека. Когда мы отправляем карту в сброс, она ложится поверх сброшенных ранее карт;
//pop() — удаляет верхний элемент из стека и возвращает его. Этот метод идеально подходит для реализации механики “игрок берет карту”
//peek() — возвращает верхний элемент стека, но не удаляет его из стека
//for (int i = colors.length -1 ; i >=0 ; i--)  вызывает обратный порядок эл-в

// for (int i = 0 ; i < colors.length; i++){
//if(i > 0 && colors[i].equals(colors[i-1])){
//    continue;
//        }   для того чтобы не повторялись эл-ты массива