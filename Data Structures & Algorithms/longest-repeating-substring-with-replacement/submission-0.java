class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,right=0;
        int maxOccur=0;
        int ans=0;
        int[] Occur=new int[26];
        for(;right<s.length();right++){
            maxOccur=Math.max(maxOccur,++Occur[s.charAt(right)-'A']);
            if(right-left+1-maxOccur>k){
             Occur[s.charAt(left)-'A']--;
             left++;
            }
            ans=Math.max(ans,right-left+1);


        }
        return ans;
    }
}
