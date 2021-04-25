package 객체지향;

public class AddStudentMethod {
    public int studentId;
    public String studentName;
    public String address;

    public void shoeStudentInfo() {
        System.out.println( studentId + "학번 학생의 이름은" + studentName + "이고 주소는 " + address +"입니다.");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}
