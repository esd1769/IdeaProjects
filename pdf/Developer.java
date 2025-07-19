package labb7.t6;

public class Developer extends Employee {
    private String language;

    public Developer(String name, double baseSalary, int hoursWorked, String language) {
        super(name, baseSalary, hoursWorked);
        this.language = language;
    }

    public void calculateSalary() {
        double finalSalary = getBaseSalary();
        if ("Java".equalsIgnoreCase(language)) {
            finalSalary += 700;
        }
        System.out.println("Language: " + language);
        System.out.println("Final Salary: $" + finalSalary);
    }
}
