package main.java.employee;

public class SalaryCalculator {

    public double calculateNetSalary(Employee employee) {
        double discount = 0.0;

        switch (employee.getPosition()) {
            case DESENVOLVEDOR:
                discount = employee.getBaseSalary() >= 3000 ? 0.20 : 0.10;
                break;
            case DBA:
                discount = employee.getBaseSalary() >= 2000 ? 0.25 : 0.15;
                break;
            case TESTADOR:
                discount = employee.getBaseSalary() >= 2000 ? 0.25 : 0.15;
                break;
            case GERENTE:
                discount = employee.getBaseSalary() >= 5000 ? 0.30 : 0.20;
                break;
            default:
                throw new IllegalArgumentException("Cargo inválido");
        }

        return employee.getBaseSalary() * (1 - discount);
    }
}
