class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n= word1.length();
        int m= word2.length();

        StringBuilder result= new StringBuilder();
        int i=0;
        int j=0;

        while(i<n || j<m){
            if(i<n) result.append(word1.charAt(i++));
            if(j<m) result.append(word2.charAt(j++));

        }

        return result.toString();
    }
}
