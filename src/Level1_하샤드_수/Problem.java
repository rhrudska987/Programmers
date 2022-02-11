package Level1_ÇÏ»þµå_¼ö;

class Solution {
    public boolean solution(int x) {
        int num = x;
        int sum = 0;
        while(num!=0) {
        	sum += num%10;
        	num /= 10;
        }
        if(x%sum==0)
        	return true;
        else 
        	return false;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		so.solution(18);
	}
}
