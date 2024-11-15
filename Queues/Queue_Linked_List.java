// Queue Using Linked-List
public class queue_linked_list {

	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node front=null;
	Node rear=null;
	
	public void Enqueue(int data)
	{
		Node node = new Node(data);
		if(front==null)
		{
			front=node;
			rear=node;
			return;
		}
		else
		{
			rear.next=node;
			rear=node;
			
		}
	}
	
	public void Dequeue()
	{
		if(front==null)
		{
			System.out.println("Queue Empty");
			return;
		}
		else
		{
			front=front.next;
		}
	}
	
	public void show()
	{
		Node temp=front;
		System.out.print("Queue is:-");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_linked_list q = new queue_linked_list();
		q.Dequeue();
		q.Enqueue(1);
		q.Enqueue(7);
		q.Enqueue(9);
		q.Enqueue(8);
		q.Enqueue(6);
		
		q.show();
		
		q.Dequeue();
		q.show();
		
		q.Dequeue();
		q.show();
	}

}
