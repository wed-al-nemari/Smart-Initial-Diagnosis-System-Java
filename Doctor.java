public class Doctor extends Staff {

    private String specialty;

    public Doctor(int id, String name, String specialty) {
        super(id, name);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void performTask() {
        System.out.println("Doctor " + name + " is diagnosing patients.");
    }
}
