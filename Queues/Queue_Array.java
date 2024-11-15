// Queue Using Array
public class queue_array {
	int MAX=5;
	int[] Queue = new int[MAX];
	int front=-1,rear=-1;
	
	public void Enqueue(int data)
	{
		if(front==-1)
			front=0;
		else if(rear==MAX-1)
		{
			System.out.println("Full");
		}
		else
		{
			rear++;
			Queue[rear]=data;
			System.out.println("Enqueued "+data+ " at "+rear);
		}
	}
	
	public void Dequeue()
	{
		if(front==-1)
			System.out.println("Empty");
		else
		{
			System.out.println("Dequeued "+Queue[front]+ " at "+front);
			front++;
		}
	}
	
	public void show()
	{
		System.out.print("Queue is:- ");
		for(int i=front;i<=rear;i++)
		{
			System.out.print(+Queue[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_array q = new queue_array();
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
