public class methodoverloading {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        System.out.println(c1.sum(10, 020));
        System.out.println(c1.sum(10, 020,30));
        System.out.println(c1.sum(10.11, 10.11));
        
    }    
}

class calculator{
    int sum(int a,int b){
        return a+b;
    }
    int sum (int a,int b,int c){
        return a+b+c;
    }
    double sum(double a ,double b){
        return a+b;
    }
    float sum(int a,int b){
        return a+b;
    } //agar hm sirf function ka type change karenge to error aagega kyoki iseme paramter kese function ka same ho sakta hai tik hai na
}// error sirf show ho run karne par nahi aaege kyki apane pehle hi define karka hai