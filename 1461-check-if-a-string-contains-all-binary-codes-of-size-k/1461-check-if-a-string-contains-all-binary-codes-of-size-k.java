class Solution {
    public boolean hasAllCodes(String s, int k) {
        int i;
        int n = (int) Math.pow(2,k);
        HashSet<String> set = new HashSet<>();
        for(i=0;i <= s.length()-k ;i++){
            set.add(s.substring(i,i+k));
            if(set.size() == n)
            return true;
            }
        return false;
     }
}