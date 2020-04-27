public class NameReg {
    public static void main(String[] args) {
        //написать программу которая разбивает на ф и о с помощью регулярных выражений
        String name = "Петя Петрович Петров";
        String[] n;
        n = name.split("\\s");
        System.out.println(n.length);


        for (int i = 0 ; i < n.length ; i++) {
            System.out.println(n[i]);
        }
    }
}
