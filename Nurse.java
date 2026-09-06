public class Nurse extends Staff {
    private String shift;

    public Nurse(int id, String name, String shift) {
        super(id, name);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    @Override
    public void performTask() {
        System.out.println("Nurse " + getName() +
                " is caring for patients on shift: " + shift);
    }
}
