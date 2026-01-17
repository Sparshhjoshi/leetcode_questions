public class InfiniteArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        InfiniteArray i1 = new InfiniteArray();
        int sol = i1.finalans(nums, 7);
        System.out.println(sol);
    }


    public int Infinite(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public int finalans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

            if (end >= arr.length) {
                end = arr.length - 1;
            }
        }
        return Infinite(arr, target, start, end);
    }
}