import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args)  {

        Map<String,String> seasonsMap = new HashMap<>();
        seasonsMap.put("春","spring");
        seasonsMap.put("夏","summer");
        seasonsMap.put("秋","autumn");
        seasonsMap.put("冬","winter");

        System.out.println(seasonsMap.get("春"));
        System.out.println(seasonsMap.get("夏"));
        System.out.println(seasonsMap.get("秋"));
        System.out.println(seasonsMap.get("冬"));
        System.out.println(seasonsMap.size());

        System.out.println("key = " + seasonsMap.keySet());
        System.out.println("value = " + seasonsMap.values());
    }
}
