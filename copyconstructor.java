public class copyconstructor {
    public static void main(String[] args) {
        copy c = new copy("hello", 10);
        copy c1 = new copy(c);

        System.out.println(c.age+c.name+"\n"+c1.age+c1.name);
    }
}


class copy{
    String name;
    int age;
    copy(String name , int age){
        this.name = name;
        this.age = age;
    }

    copy(copy c){
        this.name = c.name;
        this.age = c.age;
        //age = 19;// change after copy
    }
}