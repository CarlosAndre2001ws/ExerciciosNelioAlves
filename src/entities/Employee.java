package entities;

public class Employee {
    private final String name;
    private final double gross;
    private double netSalary;



    public Employee(String name, double gross, double tax) {
        this.name = name;
        this.gross = gross;
        netSalary = this.gross - tax;
    }

    public String netSalary() {
        return this.name + ", $ " + String.format("%.2f", netSalary);
    }

    public void increaseSalary (double percentual) {
        netSalary = netSalary + (this.gross * (percentual/100));
    }
}
