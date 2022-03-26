package Level2_다리를_지나는_트럭;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    	
    	Queue<Integer> waiting_truck = new LinkedList<>();//대기 트럭
    	for(int i:truck_weights)
    		waiting_truck.add(i);
    	
    	Queue<Integer> passing_truck = new LinkedList<>();//다리를 건너는 트럭
    	int[] bridge_truck = new int[bridge_length]; //다리를 배열로 구현
    	int time = 0;
    	int passing_truck_weight = 0; //트럭 무게
    	while(true) {
    		if(passing_truck.size()!=0) {
    			if(bridge_truck[bridge_length-1]!=0) //마지막 트럭은 다리를 건너는 큐에서 삭제
    				passing_truck_weight -= passing_truck.poll();
				
    			int[] rotate_arr = new int[bridge_length];
    			for(int i=1; i<bridge_truck.length; i++) //트럭을 전부 오른쪽으로 한 칸 이동 
    				rotate_arr[i] = bridge_truck[i-1];
    			bridge_truck = rotate_arr;
    		}
    		if(waiting_truck.size()==0) { //대기 트럭이 없다면 다리 배열에서 트럭이 전부 지나갔는지 확인
    			int count = 0;
    			for(int i=0; i<bridge_length; i++) {
    				if(bridge_truck[i]==0)
    					count++;
    			}
    			if(count == bridge_length)
    				break;
    		}
    		else {
    			passing_truck_weight += waiting_truck.peek();
    			if(passing_truck_weight<=weight) {
        			bridge_truck[0] = waiting_truck.peek();
        			passing_truck.add(waiting_truck.poll());
        		}
        		else 
        			passing_truck_weight -= waiting_truck.peek();
    		}
    		time++;
    	}    	
        return ++time;
    }
}

public class Problem {

	public static void main(String[] args) {
		Solution so = new Solution();
		int[] truck_weights = {7,4,5,6};
		System.out.println(so.solution(2, 10, truck_weights));
	}

}
