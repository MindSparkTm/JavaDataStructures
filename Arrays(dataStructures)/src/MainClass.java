
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This program is written by Surajit Das. The code basically explains how to insert,delete elements in the array
		//The code also shows how to check if the array is empty or full
		//Any corrections or suggestions is most welcome
		
		int [] temp = new int[10];
		Arrays i = new Arrays(temp,3);
		i.insert(10);
		i.insert(11);
		i.insert(13);
		i.print(); // to print the values in the array
		i.delete(); //deleting a value from the array
		i.insert(14);//inserting another element in the array
		i.print();//finally printing it out
		i.delete();
		i.print();
		i.delete();
		i.print();
		i.delete();
		i.print();
		i.insert(1);
		i.insert(2);
		i.insert(3);
		i.print();
		i.deleteall();
		i.print();
		i.insert(100);
		i.print();
		
	  
	}

}
