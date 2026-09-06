public class Department {

    private String deptName;
    private int floor;

    public Department(String deptName, int floor) {
        this.deptName = deptName;
        this.floor = floor;
    }

    public void performInitialDiagnosis() {
        System.out.println("Department: " + deptName);
        System.out.println("Location: Floor " + floor);
        System.out.println("Status: Receiving patient and performing initial diagnosis...");
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
