import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        boolean[] flag = new boolean[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    flag[i] = true;
                }
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(!flag[i]) {
                list.add(arr[i]);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}