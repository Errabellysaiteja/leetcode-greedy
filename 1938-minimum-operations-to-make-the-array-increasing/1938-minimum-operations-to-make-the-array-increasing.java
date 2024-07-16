class Solution {
    public int minOperations(int[] nums) {
       int count = 0; 
       for (int i = 1; i < nums.length; i++) {
           if (nums[i] <= nums[i - 1]) {
               int requiredIncrement = nums[i - 1] - nums[i] + 1;
               nums[i] += requiredIncrement;
               count += requiredIncrement;
           }
       }

       return count; 
    }
}
