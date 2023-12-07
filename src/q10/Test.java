package q10;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        var list = List.of("S", "P", "I", "R", "I", "T");
        list.forEach(System.out::print);
        System.out.println();
        list.stream().forEach(System.out::print);
        System.out.println();
        list.stream().map(Function.identity()).forEach(System.out::print);
        System.out.println();
        list.parallelStream().forEachOrdered(System.out::print);
        System.out.println();
        System.out.print( list.stream().collect(Collectors.joining()));
    }
}
