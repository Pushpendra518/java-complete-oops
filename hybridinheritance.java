public class hybridinheritance {
    public static void main(String[] args) {
        E e1 = new E();
        e1.a();
        e1.b();

        D d1 = new D();
        d1.a();
        d1.b();
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
class D extends B{
    public void d(){
        System.out.println("d call");
    }
}
class E extends B {
    public void e(){
        System.out.println("e call");
    }
}

// a
// | \
// b   C
// | \  
// e  f