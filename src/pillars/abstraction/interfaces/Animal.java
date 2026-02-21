package pillars.abstraction.interfaces;

public interface Animal {
    /*
    Interface methods are completely abstract and cannot have a body
    They are implemented in the respective child class
    Therefore,interfaces exhibit 100% abstraction
     */
    void sound();
    void run();
}
class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Cats meow");
    }
    @Override
    public void run(){
        System.out.println("Cats run fast");
    }
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }

    @Override
    public void run() {
        System.out.println("Dogs run fast");
    }
}
class Demo{
    public static void main(String[] args){
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.run();
        cat.sound();
        dog.run();
        dog.sound();
    }
}