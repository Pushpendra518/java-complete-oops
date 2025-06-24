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