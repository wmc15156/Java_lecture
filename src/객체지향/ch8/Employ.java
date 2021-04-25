package 객체지향.ch8;

public class Employ {

    static int serialNums = 1000;

    private int employId;
    private String employName;
    private String department;

    public Employ() {
        serialNums++;
        this.employId = serialNums;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmployName() {
        return employName;
    }

    public int getEmployId() {
        return employId;
    }

    public void setEmployId(int employId) {
        this.employId = employId;
    }

    public void setEmployName(String employName) {
        this.employName = employName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void showEmployee() {
        System.out.println(employId + employName);
    }

}
