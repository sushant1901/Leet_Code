class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
          return helper(word1).equals(helper(word2));
    }
    private String helper(String[] word){
        StringBuilder sb= new StringBuilder();
        for(String words: word){
            sb.append(words);
        }
        return sb.toString();
    }
}

// alternative solution
// return String.join("",word1).equals(String.join("",word2));
