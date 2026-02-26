package pillars.association.aggregation;
public class Patient {
    int patientAge;
    String patientName;
    String disease,dateOfArrival;
    Information info;
    Payment pay;//reference to inherit it from info class

    public Patient(String dateOfArrival, String disease, String patientName, int patientAge,Information info,Payment pay) {
        this.dateOfArrival = dateOfArrival;
        this.disease = disease;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.info=info;
        this.pay=pay;
    }
    void patientDetails(){
        System.out.println("Name:"+this.patientName);
        System.out.println("Age:"+this.patientAge);
        System.out.println("Disease:"+this.disease);
        System.out.println("Date of Arrival:"+this.dateOfArrival);
        System.out.println("Block Number:"+this.info.blockNo);
        System.out.println("Floor Number:"+this.info.floorNo);
        System.out.println("Room Number:"+this.info.roomNo);
        System.out.println("Bed Number:"+this.info.bedNo);
        System.out.println("Admission Number:"+this.pay.admFees);
        System.out.println("Registration Number:"+this.pay.regFees);
        System.out.println("Balance Amount:"+this.pay.balAmt);
    }
    public static void main(String[] args){
        Information info=new Information('C',3,4,302);
        Payment pay=new Payment(5000,10000,5000);
        Patient p1=new Patient("25/06/2026","Covid","Sushma",21,info,pay);
        p1.patientDetails();
    }
}
