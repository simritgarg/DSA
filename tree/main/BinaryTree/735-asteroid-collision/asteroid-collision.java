class Solution {
    public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> s = new Stack<>();
    
    for (int num : asteroids) {
        boolean destroyed = false;
        while (!s.isEmpty() && num < 0 && s.peek() > 0) {
            if (s.peek() < -num) {
                s.pop();
                continue;
            } else if (s.peek() == -num) {
                s.pop(); 
            }
            destroyed = true; 
            break;
        }

        if (!destroyed) {
            s.push(num);
        }
    }
    int[] res = new int[s.size()];
    for (int i = s.size() - 1; i >= 0; i--) {
        res[i] = s.pop();
    }
    return res;
}

}