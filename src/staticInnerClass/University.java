package staticInnerClass;

public class University {
    static class Admission{
        static boolean isEligible(int marks){
            return marks>=60;
        }
    }
    public static void main(String[] args) {
        boolean result=University.Admission.isEligible(45);
        System.out.println(result);
        boolean result2=University.Admission.isEligible(65);
        System.out.println(result2);
    }
}

/*
➡️In StaticInnerClass we don't need Object to access
ℹ️Points to remember:
⭐️No university object needed-No heap memory needed
⭐️Logical grouping of data-improves readability
⭐️Similar to creating utility-helper class
 */