
public class QueueClass {

	private static final int capacity = 3;
	 int arr[] = new int[capacity];
	 int size = 0;
	 int top = -1;
	 int rear = 0;
	 
	 



	public QueueClass() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty()
	{
		if (top>2)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	 public void push(int pushedElement) {
		 
		 try{
			 
			 if (top<capacity)
			 {
				 if(top<capacity-1)
				 {
				 top = top + 1;
				 }
				 arr[top] = pushedElement;
			 }
			 
			 else
			 {
				 System.out.println("Queue is full");
			 }
			 
			 
		 } catch(ArrayIndexOutOfBoundsException a)
		 {
			 System.out.println("Overflow");
		 }
		
		System.out.println("Top is" + top);
		 }
		


	 public void pop() {
		 
		try{ 
		 for(int i = 0; i<top;i++)
		 {
			 
			 arr[i] = arr[i+1];
			 
		 }
		 
		 
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		 top = top -1;

	   System.out.println("top" +"\t" + top);
	 }
	 
	 
	 public void display()
	 {
		
		try{
			
		if(top!=-1){
			for(int i=0;i<=top;i++)
			{
				
				System.out.println(i + "\t"+ arr[i]);
			}
			
		}
		
		else{
			System.out.println("Queue is Empty");
		}
		
		
		
		
		
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	 }
	 
	 
}
