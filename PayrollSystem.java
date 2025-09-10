class Employee{
    String name;
    int id;

    public void displayEmpDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}
class FullTImeEmployee extends Employee{
    double mothluSalary;
    public FullTimeEmployee(String nameValue, int idValue, double rateValue, int hoursValue){
        name = nameValue;
        id = idValue;
        hourlyRate = rateValue;
        hoursWorked = hoursValue;
    }
    public void calculatePay(){
        double totalPay = hourlyRate * hoursWorked;
        System.out.println("Total pay for this month: " + totalPay);
    }
}
class PartTimeEmployee extends Employee{
    double hourlyRate;
    int hoursWorked;
}
public class PayrollSystem{
    public static void main(String[] args) {
        FullTImeEmployee 
    }
}