package Level1_이상한_문자_만들기;

class Solution {
    public String solution(String s) {
    	String[] arr = s.split("");
    	int count = 0;
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i].equals(" ")) {
    			count = 0;
    			sb.append(" ");
    		}
    		else {
    			if(count%2==0)
    				sb.append(arr[i].toUpperCase());
    			else
    				sb.append(arr[i].toLowerCase());
    			count++;
    		}
    	}
    	String answer = sb.toString();
    	return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution("try hello world"));
	}

}
