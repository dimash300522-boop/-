package model;

public class Chef extends Staff {
    private String specialization;

    public Chef(int staffId, String name, double salary, int experienceYears, String specialization) {
        super(staffId, name, salary, experienceYears);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
}