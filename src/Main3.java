import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("春", "spring");
        map.put("夏", "summer");
        map.put("秋", "autumn");
        map.put("冬", "winter");

        String season1 = map.get("春");
        System.out.println(season1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("季節を入力してください。");
        String seasonName = scanner.nextLine();

        if (!map.containsKey(seasonName)) {
            throw new SeasonNotFoundException("その季節は見つかりません。");
        }

        System.out.println(map.get(seasonName));

    }
    }
