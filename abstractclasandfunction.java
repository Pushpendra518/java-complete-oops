public class abstractclasandfunction {
    public static void main(String[] args) {
        dog d1 =new dog();
        d1.eat();

        // also use this to override with runtime polymorphism

        animal a1 = new dog();
        a1.eat();
    }
}


abstract class animal{
   abstract public void eat(); 
}

class dog extends animal{
    @Override
    public void eat(){
        System.out.println("eating");
    }
}