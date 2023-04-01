class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer=0;
        HashMap<Character,Integer>memo= new HashMap<>();

        int release=0;
        for(int i=0;i<s.length();i++){
            Character currentChar=s.charAt(i);
            while(release<i && memo.containsKey(currentChar)){
                Character discard=s.charAt(release);
                memo.remove(discard);
                release+=1;
            }

            memo.put(currentChar,1);
            answer = Math.max(answer,i-release+1);
        }

        return answer;
    }
}
