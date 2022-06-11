class Solution {
    public int minOperations(int[] nums, int x) {
     if(x == 0) return 0;
        int sum = -x ;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum == 0) return nums.length;
        if(sum < 0) return -1;
        int left = 0, len = 0 , Calsum = 0;
        for(int right = 0; right < nums.length ; right++){
            Calsum += nums[right];
            while(Calsum > sum){
                Calsum -= nums[left++];
            }
            if(Calsum ==  sum) {
               len = Math.max(len , right - left + 1); 
            }
        }
        return len>0 ? nums.length - len : -1;
    }
}