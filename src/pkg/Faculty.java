package pkg;

public class Faculty {
    private String name;
    private float basicSalary;
    private float carAllowancePercentage;
    private float bonusPercentage;

    Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusPercentage = 4.0f;
        this.carAllowancePercentage = 2.5f;
    }

    public double calculateSalary() {
        return (this.basicSalary+(this.bonusPercentage*this.basicSalary)+(this.carAllowancePercentage*this.basicSalary));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBasicSalary(float basicSalary) {
        return this.basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getBonusPercentage() {
        return this.bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public float getCarAllowancePercentage() {
        return this.carAllowancePercentage;
    }

    public void setCarAllowancePercentage(float carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
}

