package q23;

public class Test {
    public static void main(String[] args) {
        try(
                Resource1 resource1 = new Resource1();
                Resource2 resource2 = new Resource2();
        ){
            resource1.m1(); // An exception (with message 'B') is thrown so close methods are invoked.
            resource2.m2();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
