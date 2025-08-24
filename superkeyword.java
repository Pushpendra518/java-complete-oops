public class superkeyword {
    public static void main(String[] args) {
        horse h = new horse();

    }
}

class animal{
    void animal(){
        System.out.println("animal constrtor");
    }
}

class horse extends animal{
    
    void horse(){
        super(); //ise likhe ya nahi koi farak nahi padta kyoki java me inbuilt super fun hota hai jo heirachy ko define karke run hota ghai
        
        System.out.println("horse constor");
    }
}









// class Parent {
//     void display() {
//         System.out.println("This is Parent's display()");
//     }
// }

// class Child extends Parent {
//     void display() {
//         System.out.println("This is Child's display()");
//     }

//     void show() {
//         // Call child’s own display()
//         display();

//         // Call parent’s display() using super
//         super.display();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.show();
//     }
// }
