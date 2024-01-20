
public class Appointment{
    private String apptRequestDate;
    private String apptDate;
  
    public Appointment(String apptRequestDate, String apptDate, String car){
        this.apptRequestDate = apptRequestDate;
        this.apptDate = apptDate;
        this.car = car;
    }

    public int Conversion(String apptRequestDate){
        int trait1 = apptRequestDate.indexOf('-');
        int trait2 = apptRequestDate.lastIndexOf('-');

        int year = Integer.parseInt(apptRequestDate.substring(0, trait1));
        int month = Integer.parseInt(apptRequestDate.substring(trait1 + 1, trait2));
        int day = Integer.parseInt(apptRequestDate.substring(trait2 + 1));

        return year + month + day;
    }
}
