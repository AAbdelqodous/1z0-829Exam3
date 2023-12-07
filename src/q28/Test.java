package q28;

public class Test {
    public static void main(String[] args) {
        X obj = new Y(); //Line n1
        obj.A(); //Line n2
        ((Y) obj).B(); //Line n3
        ((Y) obj).C(); //Line n4
    }
}
