public class statickeyword {
    public static void main(String[] args) {
        student s1 = new student();
        s1.School = "MVM";
        System.out.println(s1.School);

        student s2 = new student();
        System.out.println(s2.School);

        student s3 = new student();
        s3.School = "ABC";
        System.out.println(s3.School);

        
    }
}

class student{
    String name;
    int rollno;

    static String School;

    void setname(String name){
        this.name = name;
    }

    String getname(){
        return this.name;    }
}