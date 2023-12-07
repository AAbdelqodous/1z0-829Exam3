package q23;

public class Resource2  implements AutoCloseable{
    public void m2() {
        System.out.print("D");
    }
    @Override
    public void close() throws Exception {
        System.out.print("E");
    }
}
