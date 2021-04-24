package ch15;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day;

        switch (month) {
            case 1: case 3:
                day =31;
                break;
            case 4: case 6: case 8:
                day = 30;
                break;
            default:
                System.out.println("잘못된 값입니다.");
                day = -1;
        }

        System.out.println(month + "월은 " + day + "일입니다.");

   }
}
