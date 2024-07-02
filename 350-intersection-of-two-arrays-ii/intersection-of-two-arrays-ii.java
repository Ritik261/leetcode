class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l = nums1.length;
        int m = nums2.length;
        int i = 0, j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> intersection = new ArrayList<>();

        while(i< l && j < m){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                intersection.add(nums1[i]);
                i++;
                j++;

            }
        }
        int [] result = new int[intersection.size()];
        for(int k = 0 ; k< intersection.size();k++){
            result[k] = intersection.get(k);
        }
        return result;
    }
}