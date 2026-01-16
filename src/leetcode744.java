class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] == target) {
                return letters[start];
            } else if (letters[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }

        }
        return letters[0];
    }
}


public class leetcode744 {
    public static void main(String[] args) {
        char [] test = {'c','f','j'};
        Solution744 s1 =new Solution744();
        s1.nextGreatestLetter(test,'d');


    }
}
