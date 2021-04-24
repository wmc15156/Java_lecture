package day07;

public class LocalVariableInter {
    public static void main(String[] args) {
        var i = 10;
        var j = 20;
        var hello = "Hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(hello);

        hello = "test";

        System.out.println(hello);

    }
}
