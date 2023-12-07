package q43;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var list = List.of(
                new Rope(5, "red"), new Rope(10, "Red"),
                new Rope(7, "RED"), new Rope(10, "green"),
                new Rope(7, "Blue"));
        list.stream()
                .filter(new Rope.RedRopeFilter()::filter) //(Rope r) -> new Rope.RedRopeFilter().filter(r)`.
                .forEach(System.out::println);
    }
}
