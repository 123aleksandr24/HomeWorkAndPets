import java.awt.image.BufferedImage;


public class Main {
    public static void main(String[] args) {
        System.out.println("Кофе машина");

        int moneyAmount = 120;

        int[] drinkPrices = {150,80,20};
        String[] drinkPrices = {"капучино","эспрессо","вода"};
        for (int i=0; i < 3; i++ ){
             if(moneyAmount >= drinkPrices[i]){
                 System.out.println("Вы можете купить " + drinkNames[i]);
             }
        }

        //TODO:

        BufferedImage image = null;
    }

}
