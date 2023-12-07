package q37;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("*", 1);
        map.put("$", 3);
        map.put("#", 5);

        map.forEach((p,q) -> System.out.println(p.repeat(q)));
    }
}
