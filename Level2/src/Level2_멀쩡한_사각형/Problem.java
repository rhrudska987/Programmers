package Level2_멀쩡한_사각형;

class Solution {
    public long solution(int w, int h) {
    	if(w==1||h==1) //둘 중 하나라도 1이면 개수는 0
    		return 0;
    	
    	int GCD = findGCD(w, h); //최대공약수 찾기
    	int w_copy = w / GCD;
    	int h_copy = h / GCD;
    	double w_h_fraction = (w_copy >= h_copy) ? h_copy : w_copy;
    	double decreasingRate  = Math.max(w_copy, h_copy) - w_h_fraction;
    	int cutSquare = 1;
    	
    	for(int i=1; i<Math.max(w_copy, h_copy); i++) {
    		w_h_fraction -= decreasingRate;
    		if(w_h_fraction>0)
    			cutSquare += 2;
    		else if(w_h_fraction<0) {
    			cutSquare++;
    			w_h_fraction = Math.max(w_copy, h_copy) + w_h_fraction;
    		}
    		else if(w_h_fraction==0)
    			cutSquare++;
    	}
    	long answer = (long)w*h - (long)cutSquare*GCD;
        return answer;
    }
    public int findGCD(int w, int h) {
    	while(h!=0) {
    		int r=w%h;
    		w=h;
    		h=r;
    	}
    	return w;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(4, 5));
	}

}
