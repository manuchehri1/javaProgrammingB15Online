package day48;

public class FullTimeEmployeeMy extends Employee_My {

        int monthlySalary;

    public FullTimeEmployeeMy(String name, int id, int monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public int calculatingAnnualSalary() {
        return   monthlySalary*12;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
