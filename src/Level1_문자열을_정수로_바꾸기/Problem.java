package Level1_문자열을_정수로_바꾸기;

class Solution {
    public int solution(String s) {
        int answer = Integer.parseInt(s);
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution("-1234"));
	}
}
