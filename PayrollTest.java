package MainGui;

public class PayrollTest {
    public static void main(String[] args) {

        // Create Payroll object
        Payroll payroll = new Payroll();
//        Payroll payroll = new Payroll();
//        payroll.
        // Populate that payroll adding three different salaried
        // employees using fictitious information. 
        SalariedEmployee employee1 = new SalariedEmployee("MIch bank", Job.Admin, "002393", 2020, 40000);
        SalariedEmployee employee2  = new SalariedEmployee("COld biston", Job.Demonstrator, "0i9u765", 2021, 2000);
        SalariedEmployee employee3 = new SalariedEmployee("Mark Many",Job.JAnitor, "098765432", 2022, 2300);
        // System.out.println(sEmployee);

//        payroll.
        payroll.addEmployee(employee1);
        payroll.addEmployee(employee2);
        payroll.addEmployee(employee3);

        // Display the information by invoking the toString
        // method of the payroll.
        System.out.println(payroll);  
            //   System.out.println(payroll.getTotalMontlyWages());




    }
}
