class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)
                max=nums[i];
        }
         int count = 0;
        for (int i=0;i<k;i++)
        {
            count=count+max ;
            max++;
        }
        return count;

    }
}