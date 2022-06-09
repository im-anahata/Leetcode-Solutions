class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int f,l;
        f=0; l = numbers.length-1;
        while(numbers[f]+numbers[l]!=target){
            if(numbers[f]+numbers[l]>target)
                l--;
            else
                f++;
        }
        int [] arr = {f+1,l+1};
        return arr;
        }
}