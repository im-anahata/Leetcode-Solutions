class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l,i=0;
        l=m;
        while(i<n){
            nums1[l]=nums2[i];
            i++;
            l++;
            }
        Arrays.sort(nums1);
        
    }
}