package 객체지향.ch6;

public class PersonInfoTest {
    public static void main(String[] args) {
        PersonInfo person1 = new PersonInfo(180, 78, "남성", "Tomas", 37);
        String showInfo = person1.showPersonInfo();
        System.out.println(showInfo);
    }
}
