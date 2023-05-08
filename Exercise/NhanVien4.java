package Exercise;

public class NhanVien4 {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public NhanVien4(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;

    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    // Tăng lương theo phần trăm và trả lại mức lương mới
    public int raiseSalary(int percent){
        return ((getAnnualSalary() * percent) / 100) - 100;
    }

    @Override
    public String toString() {
        return "Exercise.NhanVien{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + getName() + '\'' +
                '}';
    }
}
