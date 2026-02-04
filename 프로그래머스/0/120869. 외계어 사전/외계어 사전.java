class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i = 0; i < dic.length; i++) {
            boolean[] used = new boolean[spell.length];

            for(int j = 0; j < spell.length; j++) {
                if(dic[i].contains(spell[j])) {
                    used[j] = true;
                }
            }
            for(int m = 0; m < used.length; m++) {
                if(!used[m]) {
                    break;
                }
                if(m == used.length - 1) {
                    return 1;
                }
            }
        }
    
        return 2;
    }
}