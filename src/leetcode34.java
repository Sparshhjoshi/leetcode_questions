class leetcode34 {

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search34(nums, target, true);   // first position
        ans[1] = search34(nums, target, false);  // last position

        return ans;
    }

    public int search34(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                ans = mid;   // store index

                if (isFirst) {
                    end = mid - 1;    // move left
                } else {
                    start = mid + 1;  // move right
                }
            }
        }
        return ans;
    }
}
