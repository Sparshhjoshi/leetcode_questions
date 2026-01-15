class Ceiling{
    public int Ceiling1 (int [] arr , int ele ){
        int start = 0 ;
        int end =arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == ele ) {
                return arr[mid];
            } else if (arr[mid] < ele) {
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return arr[start];
    }
}


public class ceiling_element {
    public static void main(String[] args) {
        int [] nums = {1,2,3,14,56,78,90};
        Ceiling c1 = new Ceiling();
        int result = c1.Ceiling1(nums,4);
        System.out.println(result);
        }
 }

