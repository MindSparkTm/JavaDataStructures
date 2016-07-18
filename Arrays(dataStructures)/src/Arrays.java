
public class Arrays {

 private int [] sc;
 private int size = 0;
 private int j=0;
 public Arrays(int [] sc,int size)
 {
	 this.sc =sc;
	 this.size = size;
	 
	 
	 
 }
 
 public boolean isEmpty()
 {
	 if(j==0)
	 {
		 return true;
	 }
	 
	 else if(j>0 && j<size)
	 {
		 return true;
	 }
	 
	 else
	 {
		 return false;
	 }
 }
 
 
 public void insert(int num)
 {
	 if(isEmpty()==true)
	 {
		 
		 sc[j] = num;
		 j = j +1;
		 
	 }
	 
	 else
	 {
		 System.out.println("Array full");
	 }
 }
 
 public void print()
 {
	 if(j==0)
	 {
		 System.out.println("Array is Empty");
	 }
	 
	 else
	 {
	 for(int i=0;i<j;i++)
	 {
		 System.out.println(sc[i]);
	 }
	 
	 }
 }
	
public void delete()
{
	 if(j ==0)
	 {
		 
	   System.out.println("The Array is Empty");
	 }
	 
	 else
	 {
		 
		 j = j -1;
		 System.out.println("Deletion Succesful at position:- "+ j);
		 
	 }
	
}

public void deleteall()
{
	if(j==0)
	{
		System.out.println("Array is empty and Nothing to delete");
	}
	
	else
	{
		j = 0;
	}
}
 
}