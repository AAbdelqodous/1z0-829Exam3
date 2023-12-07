package q20;

public class A {
    public void print(String name) {
        class B {
            B() {
                System.out.println(name); //Line n1
            }
        }

        B obj = new B();
    }
//    B obj = new B(); //Line n2
}
