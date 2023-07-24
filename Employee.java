public abstract class Employee extends Person{
 protected Job job;
 protected int startingYear;
 private String id;


 public Employee(String name,Job job, String id, int startingYear){
    super(name);//= name ;
    this.job = job;
    this.id = id;
    this.startingYear = startingYear;
 }

public String getId(){
    return id;
}
public abstract double getMonthlyWages();


public String toString(){
    String mm = "Name: "+ getName()+"\n"; 
    String nn = "Job: "+ job+"\n";
    String l = "Starting year: "+ startingYear; 
    String result = mm +nn+l;
    return result;
}



}