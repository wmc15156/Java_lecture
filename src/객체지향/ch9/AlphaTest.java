package 객체지향.ch9;

public class AlphaTest {
    public static void main(String[] args) {
        char[] alpha = new char[26];
        char ch = 'A';

        for(int i=0; i < alpha.length; i++) {
            alpha[i] = ch++;
        }

        for(char al : alpha) {
            System.out.println(al);
        }

    }
}
