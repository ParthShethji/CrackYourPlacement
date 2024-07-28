class Solution {
    public void moveZeroes(int[] nums) {
        int ptr = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]!=0){
                swap(ptr, i, nums);
                ptr++;
            }
        }
        for(int i=ptr; i<nums.length; i++){
            nums[i]=0;
        }
    }
    
    private void swap (int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}