class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> charSet = new HashSet<>();
       int l = 0; //initialize left of sliding window as beinging of set
       int count = 0; // current Longest SubString count =0
       for (int r =0; r<s.length(); r++){
        while(charSet.contains(s.charAt(r))){
            charSet.remove(s.charAt(l));
            l++;
        }
        charSet.add(s.charAt(r));
        count = Math.max(count,r-l+1);
       }
       
return count;
    }
}
