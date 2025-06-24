public class multilevelinhertance {
    public static void main(String[] args) {
        C c1 = new C();
        c1.c();
        c1.b();
        c1.a();
    }
}


class A{
    public void a(){
        System.out.println("a method call");
    }
}

class B extends A{
    public void b(){
        System.out.println("b method call");
    }
}

class C extends B{
    public void c(){
        System.out.println("c method call");
    }
}
