
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println("Jai Maa Manosha Maa");
		System.out.println("Queue Implementation using Arrays");
		QueueClass q = new QueueClass();
		q.push(10);
		q.push(20);
		q.push(30);
		q.display();
		q.pop();
		q.display();
		q.pop();
		q.display();
		q.push(50);
		q.display();
		q.push(60);
		q.display();
		q.push(70);
		q.pop();
		q.display();
		q.push(80);
		q.display();
		q.pop();
		q.pop();
		q.pop();
		q.display();
		q.push(100);
		q.display();
		
		System.out.println(q.isEmpty());
		
	}

}
