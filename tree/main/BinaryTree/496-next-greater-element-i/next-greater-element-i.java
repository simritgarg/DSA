class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int num: nums2){
            while(!s.isEmpty() && num>s.peek()){
                mp.put(s.pop(),num);
            }
            s.push(num);
        }
        while(!s.isEmpty()){
            mp.put(s.pop(),-1);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = mp.get(nums1[i]);
        }
        return res;
    }
}