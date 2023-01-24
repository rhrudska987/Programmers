package Level2_��ɰ���;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    	Queue<Integer> queue_progresses = new LinkedList<Integer>();
    	for(int i=0; i<progresses.length; i++) 
    		queue_progresses.offer(progresses[i]);
    	
    	ArrayList<Integer> countList = new ArrayList<>();
    	while(queue_progresses.size()!=0) {
    		int count = 0;
    		//�� ������Ʈ
    		for(int i=progresses.length-queue_progresses.size(); i<progresses.length; i++) 
    			progresses[i]+=speeds[i];
    		//�տ������� 100�� ������ ���� �����ϰ�, count++
    		for(int i=progresses.length-queue_progresses.size(); i<progresses.length; i++) {
    			if(progresses[i]>=100) {
    				count++;
    				queue_progresses.remove();
    			}
    			else 
    				break;
    		}
    		if(count != 0)
    			countList.add(count);
    	}
    	
        int[] answer = countList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}

public class Problem {
	
	public static void main(String[] args) {
		Solution so = new Solution();
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1,1,1,1,1,1};
		so.solution(progresses, speeds);
	}

}
