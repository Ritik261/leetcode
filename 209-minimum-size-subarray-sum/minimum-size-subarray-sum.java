class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n = nums.length;
        int ans = (int) Double.POSITIVE_INFINITY;
        int l=0;
        int sum =0;

        for (int i=0;i<n;i++){
            sum += nums[i];
            while(sum >= target){
                ans = Math.min(ans,i+1-l);
                sum -= nums[l++];
            }
        }
        return (ans != (int) Double.POSITIVE_INFINITY) ? ans : 0;
    }
}