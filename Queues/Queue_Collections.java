import java.util.*;
public class queue_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();

		
		System.out.println(q.peek());       // Returns Null if Queue is Empty
		//System.out.println(q.element());  // Gives Exception if Queue is Empty
		q.add(5);
		q.add(6);
		q.add(9);
		q.add(10);
		q.add(1);
		
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.remove());    // To remove the element front and returns the element removed
		
		System.out.println(q.peek());
		

	}

}
