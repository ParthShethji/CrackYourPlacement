class Solution {
    public int removeDuplicates(int[] nums) {
        int currPtr =0;
        int count =1;
        for(int i=1; i< nums.length; i++){
            if(nums[i]>nums[currPtr]){
                swap(++currPtr, i, nums);
                count++;
            }
        }
        return count;
    }
    
    public void swap (int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}