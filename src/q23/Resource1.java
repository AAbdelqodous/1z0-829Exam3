package q23;

import java.io.Closeable;

public class Resource1 implements AutoCloseable {
    public void m1() throws Exception {
        System.out.print("A");
        throw new Exception("B");
    }
    @Override
    public void close() {
        System.out.print("C");
    }
}
