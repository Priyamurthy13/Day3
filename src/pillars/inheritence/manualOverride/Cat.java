package pillars.inheritence.manualOverride;

public interface Cat {
    default void sound(){
        System.out.println("meow");
    }
}
interface Dog{
    default void sound(){
        System.out.println("woof");
    }
}
class Cog implements Cat,Dog{
    public void sound(){
        System.out.println("Some sound");
        //Cat.super.sound();
        //Dog.super.sound();
    }
}
class Demo{
    public static void main(String[] args){
        Cog cog=new Cog();
        cog.sound();
    }
}
/*
this question is asked only for the companies above 10LPA
 */
