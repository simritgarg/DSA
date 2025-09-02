class Solution {
    // public int[] asteroidCollision(int[] asteroids) {
    //     Stack<Integer> s = new Stack<>();
    //     for(int num: asteroids){
    //         if(num>0) s.push(num);
    //         else{
    //             if(!s.isEmpty() && num < s.peek()) continue;
    //             if(!s.isEmpty() && num == s.peek()) s.pop();
    //             if(!s.isEmpty() && num > s.peek()){
    //                 s.pop();
    //                 s.push(-num);
    //             }
    //         }
    //     }
    //     int[] res = new int[stack.size()];
    //     int i = stack.size() - 1;

    //     while(!stack.isEmpty()) {
    //         res[i--] = stack.pop();
    //     }

    //     return res;   
    // }
    public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> s = new Stack<>();
    
    for (int num : asteroids) {
        boolean destroyed = false;

        // Case: asteroid going left (negative), may collide with positives
        while (!s.isEmpty() && num < 0 && s.peek() > 0) {
            if (s.peek() < -num) {
                s.pop(); // right-moving asteroid destroyed
                continue; // keep checking next top
            } else if (s.peek() == -num) {
                s.pop(); // both destroyed
            }
            destroyed = true; 
            break;
        }

        if (!destroyed) {
            s.push(num);
        }
    }

    // Convert stack to array
    int[] res = new int[s.size()];
    for (int i = s.size() - 1; i >= 0; i--) {
        res[i] = s.pop();
    }

    return res;
}

}