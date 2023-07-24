public class PayrollTest {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        
        SalariedEmployee sEmployee = new SalariedEmployee("MIch bank", Job.Admin, "002393", 2020, 40000);
        SalariedEmployee employee  = new SalariedEmployee("COld biston", Job.Demonstrator, "0i9u765", 2021, 2000);
        SalariedEmployee employee2 = new SalariedEmployee("Mark Many",Job.JAnitor, "098765432", 2022, 2300);
        // System.out.println(sEmployee);

        payroll.addEmployee(employee2);
        payroll.addEmployee(employee);
        payroll.addEmployee(sEmployee);
        // System.out.println(payroll);  
              System.out.println(payroll.getTotalMontlyWages());




    }
}
