class Solution {
    public void sortColors(int[] arr) {
        int low = 0;
        int high = arr.length -1;
        int i = 0;

        while(i <= high){
            if(arr[i] == 1){
                i++;
            }

            else if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                low++;
                i++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[high];
                arr[high] = temp;
                high--;
            }

        }
    }
}