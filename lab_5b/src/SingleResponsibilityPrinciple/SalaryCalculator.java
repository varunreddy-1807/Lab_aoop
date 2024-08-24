package SingleResponsibilityPrinciple;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double baseSalary = 50000;
        switch (employee.getRole()) {
            case "Developer":
                return baseSalary + 20000;
            case "Manager":
                return baseSalary + 30000;
            case "Tester":
                return baseSalary + 15000;
            default:
                return baseSalary;
        }
    }
}

