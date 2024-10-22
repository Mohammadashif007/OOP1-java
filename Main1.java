class Job {
    String designation;
    String location;
    int salary;
    boolean dreamJob;
    
    Job(String designation, String location, int salary, boolean dreamJob){
        this.designation = designation;
        this.location = location;
        this.salary = salary;
        this.dreamJob = dreamJob;
    }

    void displayJobDetails(){
       System.out.println("Designation: " + designation);
       System.out.println("Location: " + location);
       System.out.println("Salary: " + salary);
       System.out.println("Dream Job: " + dreamJob);
        
    }
}

public class Main1 {
    public static void main(String[] args){
        Job myJob = new Job("frontend", "remote", 30000, true);
        myJob.displayJobDetails();
    }
}
