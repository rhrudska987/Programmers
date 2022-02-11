package Level1_핸드폰_번호_가리기;

class Solution {
    public String solution(String phone_number) {
        String[] arr = phone_number.split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<phone_number.length(); i++) {
        	if(i>phone_number.length()-5)
        		sb.append(arr[i]);
        	else
        		sb.append("*");
        }
        return sb.toString();
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution("01033334444");
	}

}
