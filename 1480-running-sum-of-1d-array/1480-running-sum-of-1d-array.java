class Solution {
    public int[] runningSum(int[] nums) {
        int i,l,r=0;
        l=nums.length;
        int [] arr = new int [l];
        for(i=0;i<l;i++){
            r=r+nums[i];
            arr[i]=r;
        }
        return arr;
        }
}