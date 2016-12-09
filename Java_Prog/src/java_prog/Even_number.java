package java_prog;

public class Even_number {

	public static void main(String[] args) {
		
		
		 int limit = 100;
         
         System.out.println("Printing Even numbers between 1 and " + 100);
        
         for(int i=1; i <= limit; i++){
                
                 // if the number is divisible by 2 then it is even
                 if( i % 2 == 0){
                         System.out.print(i + " ");
                 }
         }
         
	}

}
