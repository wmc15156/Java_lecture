package ch11;

public class OperatorTest {
    public static void main(String[] args) {
        int a = 150;

        int b = ++a;

        System.out.println(b); // 151
        System.out.println(a); // 151

        int c = 150;
        int d = c++;

        System.out.println(c); // 151;
        System.out.println(d); // 150;
    }
}
