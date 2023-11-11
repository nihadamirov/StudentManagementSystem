package bean;

public class Student extends Person {
    private String schoolName;
    private double scolarShip;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScolarShip() {
        return scolarShip;
    }

    public void setScolarShip(double scolarShip) {
        this.scolarShip = scolarShip;
    }
}
