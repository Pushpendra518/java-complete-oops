public class hierachicalinheritance {
    public static void main(String[] args) {
        B b1 = new B();
        b1.b();
        b1.a();

        C c1 = new C();
        c1.c();
        c1.a();
    }
}

class A{
    public void a(){
        System.out.println("a call");
    }
}
class B extends A{
    public void b(){
        System.out.println("b call");
    }
}
class C extends A{
    public void c(){
        System.out.println("c call");
    }
}