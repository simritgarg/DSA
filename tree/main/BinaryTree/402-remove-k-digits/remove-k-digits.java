class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char c: num.toCharArray()){
            while(k>0 && !s.isEmpty() && s.peek()>c){
                s.pop();
                k--;
            }
            s.push(c);
        }
        while(k>0){
            s.pop();
            k--;
        }
        for(char c: s){
            if(ans.length() == 0 && c=='0') continue;
            ans.append(c);
        }
        return ans.length()==0?"0":ans.toString();
    }
}