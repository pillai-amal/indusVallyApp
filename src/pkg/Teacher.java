package pkg;

public class Teacher extends Faculty {
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }
    @Override
    public double calculateSalary() {
        if (this.qualification.equals("Doctoral")) return (super.calculateSalary() + 20000);
        else if (this.qualification.equals("Masters")) return (super.calculateSalary() + 18000);
        else if (this.qualification.equals("Bachelors")) return (super.calculateSalary() + 15500);
        else if (this.qualification.equals("Associate")) return (super.calculateSalary() +10000);
        else return 0;
    }

    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
