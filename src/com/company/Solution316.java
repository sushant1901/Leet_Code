import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    public static int solution(String str) {
        int answer = 0;
        HashMap<Character, Integer> memo = new HashMap<>();
        int release = 0;
        for (int acquire = 0; acquire < str.length(); acquire++) {
            Character currentChar = str.charAt(acquire);

            while (release < acquire && memo.containsKey(currentChar)) {
                Character discardChar = str.charAt(release);
                memo.remove(discardChar);
                release += 1;
            }

            memo.put(currentChar,1);
            answer+=acquire-release+1;

        }

        return answer;
    }
}
