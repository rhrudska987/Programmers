package Level2_N개의_최소공배수;

class Solution {
    public int solution(int[] arr) {
    	int max = arr[0];
    	for(int i=1; i<arr.length; i++) {
    		if(arr[i]>max)
    			max = arr[i];
    	}
    	int times = 1;
    	while(true) {
    		int num = max*times;
    		boolean check = true;
    		for(int i=0; i<arr.length; i++) {
    			if(num%arr[i]!=0) {
    				check = false;
    				break;
    			}
    		}
    		if(check)
    			return num;
    		else
    			times++;
    	}
    }
}

public class Problem {

	public static void main(String[] args) {
		int[] a = {2,6,8,14};
		Solution so = new Solution();
		System.out.println(so.solution(a));
	}

}
