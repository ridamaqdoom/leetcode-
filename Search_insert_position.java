class Solution {
    public int searchInsert(int[] nums, int target) {
        // intialize left to index 0
        int left = 0;
        // right is length of the nums
        int right = nums.length -1;

        // when left is less than right 
        while(left <= right){
            // intialize mid as the middle value from left and right 
            int mid = left + (right - left)/2;
            // if num ad mid == target return index
            if (nums[mid] == target){
                return mid;
            }
            // if mid is greater than target move right 
            if(nums[mid] > target){
                right = mid -1;
            }
            // if mid is less than target move left 

            else {
                left = mid +1;
            }
                    }
        // else return left 
        return left;

    }}
        
