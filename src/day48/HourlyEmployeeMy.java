package day48;

public class HourlyEmployeeMy extends Employee_My {

    int hourlyWage;
    int numOfHours;

    public HourlyEmployeeMy(String name, int id, int hourlyWage, int numsOfHours) {
        super(name, id);
        this.hourlyWage = hourlyWage;
        this.numOfHours = numsOfHours;
    }


    public int calculatingAnnualSalary(){
        return hourlyWage*numOfHours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numsOfHours=" + numOfHours +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
