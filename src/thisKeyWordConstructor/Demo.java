package thisKeyWordConstructor;

public class Demo {
    //this keyword refers to current class members
    String i;//Instance variables
    void change(String i){
        this.i=i;//=>to remove ambiguity(confusion)
    }
    void display(){
        System.out.println("The value of i is:"+i);
    }
    public static void main(String[] args){
        Demo d=new Demo();
        d.change("ISE");
        d.display();
    }
}
