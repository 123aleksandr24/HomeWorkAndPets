import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> good2count = new HashMap<>();
        Scanner scanner= new Scanner(System.in);
        for(;;){
            String goodname = scanner.nextLine();
            if (goodname.equals("LIST")) {
                printMap(good2count);
                continue;
            }
            int count = 1;
            if (good2count.containsKey(goodname)){
                count = good2count.get(goodname) + 1;
            }
            good2count.put(goodname,count);
        }
    }
    private static  void printMap (Map<String, Integer> map){
        for (String key : map.keySet()){
            System.out.println(key + "=>" + map.get(key));
        }
    }
}
