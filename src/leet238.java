import java.util.Arrays;

class leetcode238{
    public int[] productExceptSelf(int[] nums) {
        int [] prefix = new int[nums.length];
        prefix[0]=1;
        for(int i =1; i<nums.length ; i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int [] suffix = new int[nums.length];
        suffix[nums.length-1]=1;
        for(int j =nums.length-1; j>0 ; j-- ){
            suffix[j-1]=suffix[j]*nums[j];
        }
        int [] ans = new int[nums.length];
        for(int i =0 ; i <nums.length ; i++){
            ans[i]=prefix[i]*suffix[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

}

public class leet238 {
    public static void main(String[] args) {
        int [] abr = {1,2,3,4};
        leetcode238 l1 = new leetcode238();
        l1.productExceptSelf(abr);

    }
}
