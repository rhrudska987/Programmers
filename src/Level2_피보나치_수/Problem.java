package Level2_피보나치_수;

class Solution {
    public int solution(int n) {
    	int fn = 0, fn1 = 1, fn2 = 0;
    	for(int i=1; i<n; i++) {
    		fn2 %= 1234567;
    		fn1 %= 1234567;
    		fn = fn2 + fn1;
    		fn2 = fn1;
    		fn1 = fn;
    	}
        return fn%1234567;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(3));
	}

}
