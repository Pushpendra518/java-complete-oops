public class methodoverriding {
    public static void main(String[] args) {
        dog d = new dog();
        System.out.println();
        d.eat();
    }
}

class animal {
    void eat(){
        System.out.println("animal eating");
    }
}
class dog extends animal{
    @Override
    void eat(){
        System.out.println("dog eat");
    }
}