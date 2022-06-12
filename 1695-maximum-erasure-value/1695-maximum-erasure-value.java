class Solution {
    public int maximumUniqueSubarray(int[] nums) {
     Map<Integer, Integer> lastIndex = new HashMap<>();
	int[] Sum = new int[nums.length + 1];
    int maxScore = 0;
	for (int l=0, r=0; r<nums.length; r++) {
		Sum[r+1] = Sum[r] + nums[r];
		if (lastIndex.containsKey(nums[r])) 
			l = Math.max(l, lastIndex.get(nums[r]) + 1);
		maxScore = Math.max(maxScore, Sum[r+1] - Sum[l]);
		lastIndex.put(nums[r], r);
	}

	return maxScore;
    }
}