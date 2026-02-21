package pillars.polymorphism.overriding;

public class Animal {
    void eat(){
        System.out.println("Animal eats food");
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    @Override
    void eat(){
        super.eat();
        System.out.println("Puppy drinks milk!");
    }
}
class Main{
    public static void main(String[] args){
        Animal animal=new Puppy();
        animal.eat();//From Dog class + Animal???(super.eat())
        animal.sound();//From dog class
    }
}