import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length){
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } else {
                int lastValue = list.get(list.size() - 1);
                if (lastValue < arr[i]) {
                    list.add(arr[i]);
                    i++;
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        int[] stk = new int[list.size()];
        for(int j = 0; j < list.size(); j++) {
            stk[j] = list.get(j);
        }
        
        return stk;
    }
}