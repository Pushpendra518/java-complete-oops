public class getandset {
    public static void main(String[] args) {
        setget a1 = new setget();
        a1.name = "afwerferws";
        System.out.println(a1.getter());;
    }
}

class setget{
    String name;
    int price;
    public void setter(String name){
        this.name = name;
    }
    public String getter(){
        return this.name;
    }
}