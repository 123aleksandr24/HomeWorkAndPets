public class Main {
    public static void main(String[] args) {
        //написать программу которая юудет считывать зарплату всех людей из текста и суммировать её
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String digitWithSpace = text.replaceAll("[^0-9\\s]","");
        System.out.println(digitWithSpace);
        String[] sum = digitWithSpace.split("\\s");
        System.out.println(sum.length);
        System.out.println(sum);

        int coin = 0;
        for (int i = 0; i < sum.length; i++) {
            //coin = coin + Integer.parseInt(String.valueOf(sum[i]).trim());
            //char a = (char) (coin + Integer.parseInt(sum[i].trim()));
            //coin = coin + Integer.parseInt(sum[i].trim());
            if (!sum[i].trim().equals("")) {
                coin = coin + Integer.parseInt(sum[i]);
            }
            System.out.println(coin);
        }



    }
}
