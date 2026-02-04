package model;

public class Waiter extends Staff {
    private double tipPercentage;

    public Waiter(int staffId, String name, double salary, int experienceYears, double tipPercentage) {
        super(staffId, name, salary, experienceYears);
        this.tipPercentage = tipPercentage;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    @Override
    public String toString() {
        return "Waiter [ID=" + getStaffId() + ", Name=" + getName() +
                ", Salary=" + getSalary() + ", Tips=" + tipPercentage + "%]";
    }
}