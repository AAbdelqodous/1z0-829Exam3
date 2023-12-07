package q27;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public class Test {
    static int var = 0;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var es = Executors.newFixedThreadPool(10);
        var result = new Future<?>[3];

        Stream.of("A", "R", "M")
                .toList()
                .forEach(str -> result[var++] = es.submit( () -> str));

        for (int x = 0; x < result.length; x++) {
            System.out.println(result[x].get()+"");
        }

        es.shutdown();
    }
}
