import java.util.Arrays;

class leet34{
    public int[] searchRange(int[] nums, int target) {

        int first = -1;
        int last =-1;
        int [] ans = new int [2];
        ans [0] = first;
        ans[1] = last;
        int start = 0;
        int end = nums.length - 1;

        while(start<=end){
            int mid = (start + (end-start))/2;
            if(nums[mid]==target){
                first = mid;
                start = first;

            }
            else if (target>nums[mid]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        while(start<=end){
            int mid = (start + (end-start))/2;
            if(nums[mid]==target){
                last = mid;
                end = last;
                break;
            }
            else if (target>nums[mid]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        System.out.println(Arrays.toString(ans));
        return ans ;
    }
}

public class leetcode34{
    public static void main(String[] args) {
        int [] a = {1};
        int [] b ={};
        int [] c = {1,1,2,2,3,4,5,6};
        int [] d ={1,1,2,2,3,3,4,4,5,5,6,6,7,7};
        leet34 l1 = new leet34();
        l1.searchRange(a,1);
        l1.searchRange(a,4);
        l1.searchRange(b,0);
        l1.searchRange(c,1);
        l1.searchRange(d,7);
        l1.searchRange(d,9);

    }
}