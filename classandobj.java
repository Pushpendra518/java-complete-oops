public class classandobj {

    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("red");
        p1.setthick(1);
        System.out.println(p1.color);
        System.out.println(p1.thick);

        bankacc b1 = new bankacc();
        b1.name = "Pushpendra";
        // due to public not run     b1.password = "123";
        b1.setpassword("123");
        
    }
}

class bankacc{
    public String name;
    private String password;
    public void setpassword(String pwd){
        password = pwd;
    }
}

class pen{
    int thick;
    String color;

    public void setthick(int newthick){
        thick = newthick;
    }
    public void setcolor(String newcolor){
        color = newcolor;
    }
}