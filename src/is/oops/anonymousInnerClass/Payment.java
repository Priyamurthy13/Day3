package is.oops.anonymousInnerClass;

public interface Payment {
    void pay();
}
class PaymentDemo {
    static void main(String[] args) {
        Payment p = new Payment() {
            public void pay() {
                System.out.println("Payment done using credit card.");
            }

        };
        p.pay();
       //SCALA-Java 8(Streams,Annotations,Lambdas,Reflections)
        Payment p1=()-> System.out.println("Cash payment");
    }
}

/*
ℹ️Points to remember:
⭐️One-time implementation because here p is declared as credit card and it cannot be changed
⭐️No need to create separate class
⭐️It is used in events and callback functions
 */
