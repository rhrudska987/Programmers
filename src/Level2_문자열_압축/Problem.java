package Level2_문자열_압축;

class Solution {
    public int solution(String s) {
    	char[] c_arr = s.toCharArray();
    	int answer = c_arr.length;
    	
    	for(int i=1; i<=c_arr.length/2; i++) {
    		String[] arr = new String[c_arr.length/i+1];
    		int begin = 0;
    		int end = i;
    		for(int k=0; k<arr.length-1; k++) {//문자열을 압축할 단위에 따라 배열에 삽입
    			arr[k] = s.substring(begin, end);
    			begin += i;
    			end += i;
    			if(end>c_arr.length) {
    				arr[++k] = s.substring(begin, c_arr.length);
    				break;
    			}
    		}
    		
    		StringBuilder sb = new StringBuilder();
    		int count = 1;
    		for(int j=0; j<arr.length-1; j++) {
    			if(!arr[j].equals(arr[j+1])) {
    				if(count!=1)
    					sb.append(count + arr[j]);
    				else
    					sb.append(arr[j]);
    				count = 1;
    			}
    			else
    				count++;
    		}
    		sb.append(arr[arr.length-1]);
    		
    		char[] c_arr2 = sb.toString().toCharArray();
    		if(c_arr2.length<answer)
    			answer = c_arr2.length;
    	}
        return answer;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution("ababcdcdababcdcd");
	}

}
