import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.sort(list);
        int index = Collections.binarySearch(list, "хз");
        HashSet<String> set = new HashSet<>();
        set.addAll(list);
        Scanner scanner = new Scanner(System.in);
        long start = System.currentTimeMillis();
        for (;;){
            //Прямой перебор list.contains()
            //Бианрный поиск Collections.binarySearch()
            //TreeSet
            //HashSet


            long duration = System.currentTimeMillis() - start;
        }

    }
    //A333AA197
    //CMTBAPOHEYИKX

}
