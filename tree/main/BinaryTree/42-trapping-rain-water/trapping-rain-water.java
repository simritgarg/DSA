class Solution {
    public int trap(int[] height) {
        // with 2P
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftVal = 0;
        int rightVal = 0;
        int max = 0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftVal){
                    leftVal = height[left];
                }
                else{
                    max += leftVal - height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightVal){
                    rightVal = height[right];
                }
                else{
                    max += rightVal - height[right];
                }
                right--;
            }
        }
        return max;
    }
}