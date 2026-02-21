package copyObjects;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    //static copy method
    static Employee copy(Employee e){
        return new Employee(e.id,e.name);
    }
    public static void main(String[] args){
        Employee e1=new Employee(101,"Amit");
        Employee e2=Employee.copy(e1);//Correct use
        //Employee e3=e2;//Not recommended!can led to errors!
        e2.display();
    }
    static{
        System.out.println("Start of execution");
        System.out.println("Db-loading");
        System.out.println("System loading");
    }
}
