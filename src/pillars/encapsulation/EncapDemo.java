package pillars.encapsulation;

public class EncapDemo {
    public static void main(String[] args){
        Student s1=new Student();
        //s1.USN//No access
        //use of setters
        s1.setUSN(101);
        s1.setEmail("pri@gmail.com");
        //use of getters
        System.out.println(s1.getUSN());
        System.out.println(s1.getEmail());
    }
}
