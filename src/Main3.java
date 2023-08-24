import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("春","spring");
        map.put("夏","summer");
        map.put("秋","autumn");
        map.put("冬","winter");


        String season1 = map.get("春");
        System.out.println(season1);

        String season5 = map.get("梅雨");
        System.out.println(season5);

        throw new NullPointerException("その季節は見つかりません。");

        }
    }
