import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(list.isEmpty()) {
                list.add(arr[i]);
            } else if (list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
            } else {
                list.add(arr[i]);
            }
        }
        if(list.isEmpty()) {
            list.add(-1);
        }
        
        
        int[] answer = new int[list.size()];
        for(int j = 0; j < answer.length; j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }
}