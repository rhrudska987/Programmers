package Level2_�ٸ���_������_Ʈ��;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    	
    	Queue<Integer> waiting_truck = new LinkedList<>();//��� Ʈ��
    	for(int i:truck_weights)
    		waiting_truck.add(i);
    	
    	Queue<Integer> passing_truck = new LinkedList<>();//�ٸ��� �ǳʴ� Ʈ��
    	int[] bridge_truck = new int[bridge_length]; //�ٸ��� �迭�� ����
    	int time = 0;
    	int passing_truck_weight = 0; //Ʈ�� ����
    	while(true) {
    		if(passing_truck.size()!=0) {
    			if(bridge_truck[bridge_length-1]!=0) //������ Ʈ���� �ٸ��� �ǳʴ� ť���� ����
    				passing_truck_weight -= passing_truck.poll();
				
    			int[] rotate_arr = new int[bridge_length];
    			for(int i=1; i<bridge_truck.length; i++) //Ʈ���� ���� ���������� �� ĭ �̵� 
    				rotate_arr[i] = bridge_truck[i-1];
    			bridge_truck = rotate_arr;
    		}
    		if(waiting_truck.size()==0) { //��� Ʈ���� ���ٸ� �ٸ� �迭���� Ʈ���� ���� ���������� Ȯ��
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
