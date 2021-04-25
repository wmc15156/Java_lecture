package 객체지향.ch4;

public class Student {
    int studentId;
    String studentName;
    int grade;

    public Student(int studentId, String studentName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentId + "이고" + grade + "학년입니다.";
    }
}
