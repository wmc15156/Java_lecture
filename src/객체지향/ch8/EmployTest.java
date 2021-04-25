package 객체지향.ch8;

public class EmployTest {
    public static void main(String[] args) {
        Employ kim = new Employ();
        kim.setEmployName("김현진");

        kim.showEmployee();

        Employ lee = new Employ();
        lee.setEmployName("이부르스");

        lee.showEmployee();

    }
}
