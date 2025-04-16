class A {
    void method (I i){
        i.method();
    }
}

interface I {
    public void method();
}
class B implements I {
    public void method(){
        System.out.println("B METHOD");
    }
}
class C implements I {
    public void method(){
        System.out.println("C METHOD");
    }
}
class D implements I {
    public void method(){
        System.out.println("D METHOD");
    }
}


public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.method(new D());
        B b = new B();
        a.method(b);
    }
}
