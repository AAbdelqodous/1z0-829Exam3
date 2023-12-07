package q36;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("mars", "pluto", "sun",
                "earth", "mars", "pluto");
        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);
    }
}
