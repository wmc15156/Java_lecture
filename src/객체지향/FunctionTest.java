package 객체지향;

public class FunctionTest {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int result = add(n1, n2);
        System.out.println(result);

        sayHello("Hello world");

        int result2 = calcSum();
        System.out.println(result2);
    }
}
