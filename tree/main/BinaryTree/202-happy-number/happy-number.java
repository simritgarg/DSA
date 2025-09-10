class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=1){
           if (seen.contains(n)) return false;
            seen.add(n);
            n = sqsum(n);
        }
        return true;        
    }
    public int sqsum(int n){
            int sum = 0;
            while(n>0){
                int digit = n%10;
                sum += digit*digit;
                n /= 10;
            }
            return sum;
        }
}