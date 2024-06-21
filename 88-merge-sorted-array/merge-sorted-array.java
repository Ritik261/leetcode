class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j  = 0;
        int index = 0;


        int[] nums1Copy = new int[m];
        System.arraycopy(nums1, 0, nums1Copy, 0, m);

        while(i < m && j < n){
            if(nums1Copy[i] <= nums2[j]){
                nums1[index] = nums1Copy[i];
                i++;
            } else {
                nums1[index] = nums2[j];
                j++;
            }
            index++;
        }

        while(i < m){
            nums1[index] = nums1Copy[i];
            i++;
            index++;
        }

        while(j < n){
            nums1[index] = nums2[j];
            j++;
            index++;
        }
    }
}
