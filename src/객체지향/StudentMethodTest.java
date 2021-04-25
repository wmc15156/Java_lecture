package 객체지향;

public class StudentMethodTest {
    public static void main(String[] args) {
        AddStudentMethod studentLee = new AddStudentMethod();
        studentLee.studentId = 12345;
        studentLee.setStudentName("김현진");
        studentLee.address = "서울시 금천구";

        studentLee.shoeStudentInfo();
    }
}
