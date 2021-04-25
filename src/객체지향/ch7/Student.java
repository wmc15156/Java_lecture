package 객체지향.ch7;

public class Student {
    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.name = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.name = name;
        math.score = score;
    }

    public void showStudentInfo() {
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + " 입니다.");
    }
}
