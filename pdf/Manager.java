package labb7.t6;

public class Manager extends Employee {
    private double bonusPercentage;
    //double finalSalary;



    public Manager(String n,double baseSalary,int hoursWorked,double bonusPercentage){
        super(n,baseSalary,hoursWorked);

        this.bonusPercentage = bonusPercentage;


    }

    public void requestIncrement(double bammount){


        if (getHoursWorked()>100){
            System.out.println("$"+bammount+" Increment approved.");
            setBaseSalary(getBaseSalary()+ bammount);
        } else if (getHoursWorked() >80) {
            System.out.println("$" +(bammount/2) +" Increment approved.");
            setBaseSalary(getBaseSalary()+(bammount/ 2));
        } else {
            System.out.println("Increment denied." );
        }
    }

    public void calculateSalary(){
        //finalSalary = getBaseSalary()*(1 +bonusPercentage /100);
       double finalSalary = getBaseSalary()*(1 +bonusPercentage /100);
        System.out.println("Bonus: " +bonusPercentage +" %");
       System.out.println("Final Salary: $"+finalSalary);
    }
}
