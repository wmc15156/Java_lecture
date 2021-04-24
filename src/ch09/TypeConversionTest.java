package ch09;

public class TypeConversionTest {
    public static void main(String[] args) {
        byte bNum = 125;
        int iNum = bNum;

        int iNum2 = 255;

        double dNum = 3.14;
        int i = (int)dNum;

        System.out.println(iNum);
        System.out.println(bNum);

        double a = 1.2;
        float f = 0.9F;

        int iNum1 = (int)a + (int)f;
        int sum = (int)(a + f);

        System.out.println(iNum1);
        System.out.println(sum);
    }
}
