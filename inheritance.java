public class inheritance {

    public static void main(String[] args) {
        animal a1 = new animal();
        a1.sound();
        a1.color();

        dog d1 = new dog();
        d1.food();
        d1.color();
        d1.sound();
    }
}

class animal{//base or parent class
    public void sound(){
        System.out.println("bark of animal");
    }
    public void color(){
        System.out.println("many color like black whiten and more");
    }
}

class dog extends animal{//derived or child class
    public void food(){
        System.out.println("eat dog food");
    }
}