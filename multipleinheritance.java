public class multipleinheritance {
    public static void main(String[] args) {
        intro i =new intro();
        i.a();
        i.b();
    }
}

interface A{
    void a();
}
interface B{
    void b();
}

class intro implements A,B{
    public void a(){
        System.out.println("a calling");
    }
    public void b(){
        System.out.println("b calling");
    }
    
}