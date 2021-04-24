package ch12;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
       int max;
       Scanner scanner = new Scanner(System.in);
       System.out.println("두 수를 입력 받아서 더 큰수를 출력하세요");
       System.out.println("입력1: ");
       int num = scanner.nextInt();

       System.out.println("입력2: ");
       int num2 = scanner.nextInt();

       max = (num > num2) ? num : num2;

       System.out.println(max);

    }
}
