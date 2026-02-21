package is.oops.withconstructor;

public class Student {
    int USN;
    String name;
    int marks;
    //Static is not for objects-it directly belongs to the class
    static String college="SNPSU";//use for common parameters
    Student(String name,int USN,int marks){
        this.name=name;
        this.USN=USN;
        this.marks=marks;
    }
    void evaluateMarks() {
        if (marks >= 40) {
            System.out.println(name + "PASSED");
        } else {
            System.out.println(name + "FAILED");
        }
    }
    void studentDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("USN:"+this.USN);
        System.out.println("Marks:"+this.marks);
        System.out.println("College:"+college);
    }
    public static void main(String[] args){
        //Object creation=>ClassName obj=new ClassName();
        Student s1=new Student("Priyanka",75,80);
        Student s2=new Student("Pranav",73,70);
        s1.evaluateMarks();
        s2.evaluateMarks();
        s1.studentDetails();
        s2.studentDetails();
    }
}
