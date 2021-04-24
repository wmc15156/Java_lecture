package ch16;

import java.util.Scanner;

public class DoWhileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        do {
            System.out.println("do 실행");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

    }
}
