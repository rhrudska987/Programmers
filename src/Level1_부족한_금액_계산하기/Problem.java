package Level1_부족한_금액_계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i=1; i<=count; i++) {
        	answer += i*price;
        }
        
        if(answer>=money) {
        	return (long)(answer-money);
        }
        else return 0;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		System.out.println(so.solution(3, 20, 4));
	}
}
