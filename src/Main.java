import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> seasonslist = new ArrayList<>();
        seasonslist.add("春");
        seasonslist.add("夏");
        seasonslist.add("秋");
        seasonslist.add("冬");

        System.out.println(seasonslist.size());
        System.out.println(seasonslist.get(0));
        System.out.println(seasonslist.get(1));

        System.out.println();

        for (String season : seasonslist) System.out.println(season);
    }
}