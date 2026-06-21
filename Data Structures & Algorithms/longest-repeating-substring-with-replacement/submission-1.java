class Solution {
    public int characterReplacement(String s, int k) {
        
        int right=0;
        int left=0;
        int[] occur= new int[26];
        int maxo=0;
        int ans=0;
        for(;right<s.length();right++){
            maxo=Math.max(maxo,++occur[s.charAt(right)-'A']);
            if(right-left+1-maxo>k){
                occur[s.charAt(left)-'A']--;
                left++;
               
            }
             ans=Math.max(ans,right-left+1);

        }
        return ans;

    }
}
