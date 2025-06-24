public class inherianceheiarchy {
    public static void main(String[] args) {
        mustang m1 = new mustang();
        
    }
}


class animal {
    animal() {
        System.out.println("animal constructor called");
    }
}

class horse extends animal{
    horse(){
        System.out.println("horse constructor called");
    }
}
class mustang extends horse{
    mustang(){
        System.out.println("mustang constructor called");
    }
}
//animal → horse → mustang
