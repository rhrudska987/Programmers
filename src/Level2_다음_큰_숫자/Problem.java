package Level2_다음_큰_숫자;

class Solution {
    public int solution(int n) {
    	String binary1 = Integer.toBinaryString(n);
    	char[] c_arr1 = binary1.toCharArray();
    	
    	int num1 = 0;
    	for(int i=0; i<c_arr1.length; i++) {
    		if(c_arr1[i]=='1')
    			num1++;
    	}
    	
    	while(true) {
    		String binary2 = Integer.toBinaryString(++n);
    		char[] c_arr2 = binary2.toCharArray();
    		int num2 = 0;
        	for(int i=0; i<c_arr2.length; i++) {
        		if(c_arr2[i]=='1')
        			num2++;
        	}
    		if(num1==num2)
    			break;
    	}
    	return n;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(78));
	}

}
