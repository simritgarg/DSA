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

        // using montonic stack
        // Stack<Integer> s = new Stack<>();
        // int max = 0;
        // for(int i=0;i<n;i++){
        //     while(!s.isEmpty() && height[i]>height[s.peek()]){
        //         int top = s.pop();
        //         if(s.isEmpty()) break;
        //         int b = i - s.peek() - 1;
        //         int h = Math.min(height[i], height[s.peek()]) - height[top];
        //         max += b*h;
                
        //     }
        //     s.push(i);
        // }
        // return max;
    }
}