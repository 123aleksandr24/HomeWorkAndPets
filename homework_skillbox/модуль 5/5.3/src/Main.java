import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(); // неупорядоченная коллекция
        //TreeSet - алфавитный порядок
        Scanner scanner = new Scanner(System.in);
        String amail = scanner.nextLine();

        if (amail.equals("LIST")){
            printmap(words);
            continue;
        }

        words.add("Первое");
        words.add("Второе");
        words.add("Первое");
        words.add("Третье");
        words.add("Второе");

        words.contains("Первое");

        for (String word : words){
            System.out.println(word);
        }
    }

    private static void printmap(HashSet<String> words) {
        for (String key : words )
    }
}
// написать перечень эмэилов уникальных эмэилы нужно добавлять через консоль и проверять командой LIST