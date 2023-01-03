class Solution {
public String getHint(String secret, String guess) {
    int[] nums = new int[10];
    char[] s = secret.toCharArray();
    char[] g = guess.toCharArray();
    int a = 0, b = 0;
    for(int i = 0; i < s.length; i++){
        if(s[i] == g[i]) {
            a++;
        } else{
            if(nums[g[i] - '0']-- > 0) b++;
            if(nums[s[i] - '0']++ < 0) b++;
        }
    }
    return a + "A" + b + "B";
}
}
