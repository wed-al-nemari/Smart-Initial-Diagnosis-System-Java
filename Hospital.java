public class Hospital {

    private String hospitalName;
    private Department dept;

    public Hospital(String hospitalName, Department dept) {
        this.hospitalName = hospitalName;
        this.dept = dept;
    }

    public void showHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);
        dept.performInitialDiagnosis();
    }
}
