import java.util.ArrayList;

public class Payroll {
    private ArrayList<Employee> employees;


    public Payroll(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e1){
        employees.add(e1);
    }

    public double getTotalMontlyWages(){
        double sumOfWages = 0.0;
        for (Employee ez : employees) {
           sumOfWages = sumOfWages + ez.getMonthlyWages();
        //  sumOfWages += ez.getMonthlyWages();

        }
        return sumOfWages;
    }

    
    @Override
    public String toString(){
        String mm = "Employees: "+ employees.toString()+"\n"; 
        String nn = "Total Number: "+ employees.size()+"\n";
        String l = "Total Monthly Wages : "+ getTotalMontlyWages();     
        String result = mm +nn+l;
        return result;
    }


}
