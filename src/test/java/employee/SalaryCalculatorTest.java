package test.java.employee;

import main.java.employee.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    private final SalaryCalculator calculator = new SalaryCalculator();

    @Test
    void shouldCalculateNetSalaryForDeveloperWithHighSalary() {
        Employee employee = new Employee("Alice", "alice@example.com", 3000.00, Position.DESENVOLVEDOR);
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(2400.00, netSalary);
    }

    @Test
    void shouldCalculateNetSalaryForDeveloperWithLowSalary() {
        Employee employee = new Employee("Bob", "bob@example.com", 2500.00, Position.DESENVOLVEDOR);
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(2250.00, netSalary);
    }

    @Test
    void shouldCalculateNetSalaryForDBAWithHighSalary() {
        Employee employee = new Employee("Charlie", "charlie@example.com", 2500.00, Position.DBA);
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(1875.00, netSalary);
    }

    @Test
    void shouldCalculateNetSalaryForDBAWithLowSalary() {
        Employee employee = new Employee("David", "david@example.com", 1800.00, Position.DBA);
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(1530.00, netSalary);
    }

    @Test
    void shouldCalculateNetSalaryForTesterWithHighSalary() {
        Employee employee = new Employee("Eva", "eva@example.com", 2200.00, Position.TESTADOR);
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(1650.00, netSalary);
    }

    @Test
    void shouldCalculateNetSalaryForTesterWithLowSalary() {
        Employee employee = new Employee("Frank", "frank@example.com", 1500.00, Position.TESTADOR);
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(1275.00, netSalary);
    }

    @Test
    void shouldCalculateNetSalaryForManagerWithHighSalary() {
        Employee employee = new Employee("Grace", "grace@example.com", 6000.00, Position.GERENTE);
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(4200.00, netSalary);
    }

    @Test
    void shouldCalculateNetSalaryForManagerWithLowSalary() {
        Employee employee = new Employee("Hank", "hank@example.com", 4000.00, Position.GERENTE);
        double netSalary = calculator.calculateNetSalary(employee);
        assertEquals(3200.00, netSalary);
    }
}
