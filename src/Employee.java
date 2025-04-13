public class Employee {

    private static int idGenerator=1;

    private  String fullName;
    private int departament;
    private  int salary;
    private  int id;

    public Employee(String fullName,  int departament, int salary){
        id=idGenerator++;
        this.fullName=fullName;
        this.departament=departament;
        this.salary=salary;

    }
    public void setFullName(String fullName) {
        this.fullName=fullName;
    }

    public void setDepartament(int departament) {
        this.departament=departament;
    }

    public void setSalary(int salary) {
        this.salary=salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartament() {
        return departament;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ", id=" + id +
                "departament=" + departament +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary;


    }
}
