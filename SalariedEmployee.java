public class SalariedEmployee extends Employee{

    private double annualSalary;

    public SalariedEmployee(String name, Job job, String id, int StartingYear, double annualSalary) {
        super(name, job, id, StartingYear);
        this.annualSalary = annualSalary;
    }

    @Override
    public double getMonthlyWages() {
        return annualSalary / 12;
    }

    // @Override
    // public String getId(){
    //     return "nuuuubu";
        
    // }
@Override
    public String toString(){
        String mm = "Name: "+ getName()+"\n"; 
        String nn = "Job: "+ job+"\n";
        String l = "Starting year: "+ startingYear+"\n";     
        String ln = "Annual Salary: "+ annualSalary; 
        String result = mm +nn+l+ln;
        return result;
    }
      
    
    // FROM A ABSTRACT CLASS, OR NORMAL CLASS
    // EVERY METHODS OF A SUPER CLASS CAN BE OVERRIDEN BY THE SUBCLASS
    // BUT ABSTRACT METHODS ARE A MUST TO OVERRIDE



}