package java_prog;

public class For_loop {

	public static void main(String[] args) {
		
		//print 5,4,3,2,1,0
		
		for(int Increment = 0 ;Increment <=5 ; Increment++)
		{
				
				System.out.println( " print the value ==> " + Increment );
	}
		System.out.println ("<==== Next Loop Print ===>");
		
		//print 0,1,2,3,4,5
		
		for(int i=5 ; i>=0 ; i--)
		{
		System.out.println("Print the value ==> " +i);
		}
		
		System.out.println("<==== Next Loop Print ===>"); 
		
		//Print 0,2,4
		
		for(int j=0 ; j<=5 ; j+=2)
		{
			System.out.println("Print the value ==>" +j);
		}
		
		System.out.println("<==== Next Loop Print ===>");
		
		//Print even numbers 
		
		for(int i=2 ; i<=100 ; i++)
		{
			if (i%2 == 0)
			{
				System.out.println("Even number = " +i);
			}
			
		}
			
			System.out.println("<=== Next Loop Print ===>");
			
		
		
		//Print Odd numbers
		
		for(int i=2 ; i<=100 ; i++)
		{
			if (i%2 != 0)
			{
				System.out.println("Odd Numbers= "+i);
			}
		}
			
			System.out.println("<=== Next Loop Print ===>");
			
		
		
		//Print 0,1,2,3,4,5,6,7 using break .
		
		for (int i=0 ; i<=15 ; i++)
		{
			if(i==10)
			{
				break;
			}
			System.out.println("Print the numbers ==> " +i);
			
		}

		System.out.println("<=== Next Loop Print ===>");
		
		//Print 0,1,3,4,5 using contunue loop
		
		for(int i=0 ; i<=5 ; i++)
		{
			if(i==2)
			{
				continue;
			}
			System.out.println ("Print numbers ==>" +i);
			
		}
		
		System.out.println("<=== Next Loop Print ===>");
		
		//print 2 
		
		for (int i=0 ; i<=5 ;i++)
		{
			if(i==2){

			System.out.println("Print the single number ==> " +i);
			continue;
			}
		System.out.println("<==Next Loop Print==> " +i);
		
		//print odd numbers from 1-10 using while loop
		
		int i1 =1;
		while (i1 <=10)
		{
			if (i1%2==0)
			{
				System.out.println("Print the numbers==>" +i1);
			}
			i1++;
		}		
	}
		String i = null;
		System.out.println("<==Next loop Print==> " +i);
		
}
}
