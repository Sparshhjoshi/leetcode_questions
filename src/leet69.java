class leetcode69 {
    public void mySqrt(int x) {

        for (double i = 0; i <= x; i++) {
            if (i * i == x) {
                System.out.println(i);
            }
        }
    }
}

public class leet69 {
    public static void main(String[] args) {
        leetcode69 l1 = new leetcode69();
        l1.mySqrt(8);

    }
}
