class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;

        Set<Integer> set = new HashSet<>();

        while( i < nums1.length && j < nums2.length){
          if(nums1[i] == nums2[j]){
            set.add(nums1[i]);
            i++;
            j++;
          }
          else if(nums1[i] < nums2[j]){
            i++;
          }
          else j++;
        }
        int index = 0;
        int[] result = new int[set.size()];

        for(var num: set){
            result[index] = Integer.parseInt(num.toString());
            index++;

        }
        return result;

       
    }
}