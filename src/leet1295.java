public class leet1295 {
    public static void main(String[] args) {
        int [] nums = {1,2,44,55,66,1232};
        int digit=0;
        for(int i=0 ; i<nums.length ; i++) {

            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                digit++;
            }
        }
        



    }
}

