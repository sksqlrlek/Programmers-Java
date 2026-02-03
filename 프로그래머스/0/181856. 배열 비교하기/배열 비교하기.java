class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        }
        
        int a = 0;
        int b = 0; 
        
        for(int n : arr1) {
            a += n;
        }
        for(int n : arr2) {
            b += n;
        }
        
        if(a > b) {
            return 1;
        } else if(a < b) {
            return -1;
        } else {
            return 0;
        }
    }
}