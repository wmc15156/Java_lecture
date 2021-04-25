package 객체지향.ch7;

public class StudentTest {
    public static void main(String[] args) {
        Student me = new Student(123, "김현진");
        me.setKoreaSubject("korean", 100);
        me.setMathSubject("math", 100);
        me.showStudentInfo();
    }
}
