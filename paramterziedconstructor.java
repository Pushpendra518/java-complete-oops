public class paramterziedconstructor {
    public static void main(String[] args) {
        abc a1 = new abc("riya", 16);
        System.out.println("name is "+a1.name+"and age is "+a1.age);

        student s1 = new student();
        student s2 = new student("hello");
    }
}


class abc{
    String name;
    int age;
    abc(String name,int age){
        this.name = name;
        this.age = age;
    }
}

class student{
    student(){
        System.out.println("default constructor");
    }
    String name;
    student(String name){
        
        this.name = name;
        System.out.println("parametrized constructor");
    }
}