package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {

    	Employee employee1 = new Employee("Alice", "Developer");
        Employee employee2 = new Employee("Bob", "Manager");
        Employee employee3 = new Employee("Charlie", "Tester");

      
        SalaryCalculator salaryCalculator = new SalaryCalculator();

       
        double salary1 = salaryCalculator.calculateSalary(employee1);
        double salary2 = salaryCalculator.calculateSalary(employee2);
        double salary3 = salaryCalculator.calculateSalary(employee3);

       
        System.out.println("Salary for " + employee1.getName() + " (" + employee1.getRole() + "): $" + salary1);
        System.out.println("Salary for " + employee2.getName() + " (" + employee2.getRole() + "): $" + salary2);
        System.out.println("Salary for " + employee3.getName() + " (" + employee3.getRole() + "): $" + salary3);
    }
}

