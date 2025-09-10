class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 1;
        for(int i=2;i<num;i++){
            if(num%i==0) sum += i;
        }
        return sum == num && num != 1;
    }
}