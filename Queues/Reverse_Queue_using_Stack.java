import java.util.* ;
import java.io.*; 
import java.util.Queue;

public class Solution {
    public static void reverse(Queue < Integer > q) {
        // Write your code here.
        Stack<Integer> st = new Stack<>();
        
        while(!q.isEmpty())
        {
            st.push(q.remove());
        }
        
        while(!st.isEmpty())
        {
            q.add(st.pop());
        }
        
        return;
    }
}
