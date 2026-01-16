class Floor{
    public int Floor1 (int [] arr , int ele ){
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
        return arr[end];
    }
}


public class Floor_element {
    public static void main(String[] args) {
        int [] nums = {1,2,3,14,56,78,90};
        Floor f1 = new Floor();
        int result = f1.Floor1(nums,4);
        System.out.println(result);

    }
}


//hello my name is sparsh joshi
