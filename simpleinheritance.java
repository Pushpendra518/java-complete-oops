public class simpleinheritance {
    public static void main(String[] args) {
        B b = new B();
        b.a1();
        b.b1();
    }
}

class A{
    public void a1(){
        System.out.println("single inheritance based class ");
    }
}

class B extends A{
    public void b1(){
        System.out.println("single inheritance derived class ");
    }
}