public class Driver {
    public static void main(String[] args) {
        Department d = new Department("Emergency", 1);
        Hospital hosp = new Hospital("King Fahd Hospital", d);

        Staff dr1 = new Doctor(1, "Ahmad", "Emergency");
        Staff dr2 = new Doctor(2, "Sara", "Cardiology");
        Staff nurse1 = new Nurse(3, "Mona", "Morning");

        hosp.showHospitalInfo();
        System.out.println("------------------");
        dr1.performTask();
        dr2.performTask();
        nurse1.performTask();
    }
}
