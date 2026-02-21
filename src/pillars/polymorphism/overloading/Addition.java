package pillars.polymorphism.overloading;

public class Addition {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static void add(double a,double b){
        System.out.println("Double");
        System.out.println(a+b);
    }
    static void add(float a,float b){
        System.out.println("float");
        System.out.println(a+b);
    }
    public static void main(String[] args){
        add(1,2);
        add(1.2,2.4);
        add(8.2f,3.4f);
    }
}
