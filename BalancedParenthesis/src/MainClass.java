import java.util.Stack;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.out.println(checkforparenthesis("foo(bar[i)"));
		
		
	}
	
	
	public static boolean checkforparenthesis(String s)
	{
		
		int n = s.length();
		Stack<Character> st = new Stack<Character>();
		int i =0;
		for( i =0;i<n;i++)
		{
			if(s.charAt(i)=='(' || s.charAt(i)=='{' ||s.charAt(i)=='[')
			{
				st.push(s.charAt(i));
				
			}
			
			else if(s.charAt(i)==')' ||s.charAt(i)=='}' ||s.charAt(i)==']')
			{
				if(st.isEmpty())
				{
					

					return false;
					
				}
				else
				{
					st.pop();
				}
			}
		}
		
		if(st.isEmpty())
		{
			return true;
		}

		else
		{

			return false;
		}
		
		
		
		
		
		
	}

}
