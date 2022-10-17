class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean allLetterPresent =true;
        for(char ch='a';ch<='z';ch++){
            if(!sentence.contains(String.valueOf(ch))){
                allLetterPresent=false;
                break;
            }
        }
        if(allLetterPresent) return true;
        else return false;
    }
}
