class Solution {
    public int minDifference(int[] nums) {
        if(nums.length <= 4) return 0;
        int n = nums.length;
        Arrays.sort(nums);

        int opt1 = nums[n-4]-nums[0];
        int opt2 = nums[n-3]-nums[1];
        int opt3 = nums[n-2]-nums[2];
        int opt4 = nums[n-1]-nums[3];

        return Math.min(opt1,Math.min(opt2,Math.min(opt3,opt4)));
    }
}