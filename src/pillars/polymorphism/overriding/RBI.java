package pillars.polymorphism.overriding;

public class RBI {
    double rateOfInterest(){
        return 6.5;
    }
}
class ICICI extends RBI{
    @Override
    double rateOfInterest(){
        return 7.2;
    }
}
class HDFC extends RBI{
    @Override
    double rateOfInterest(){
        return 8.2;
    }
}
class Demo{
    public static void main(String[] args){
        //The reference doesn't matter ,the object type matters
        RBI r1=new RBI();
        RBI r2=new ICICI();
        RBI r3=new HDFC();
        System.out.println("RBI roi:"+r1.rateOfInterest()+"%");
        System.out.println("ICICI roi:"+r2.rateOfInterest()+"%");
        System.out.println("HDFC roi:"+r3.rateOfInterest()+"%");
    }
}