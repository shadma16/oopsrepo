package exceptionExample;

public class ExceptionEg {

	public static void main(String[] args) {
     int a=10;
     int b=0;
     try
     {
    	    int c= a/b; 
     }
     
    /* catch(ArithmeticException e) exception kanikenula so we sue a variable name e  : exception detailsine hold cheyene variable
   {
    	 b=2;
    	 int d=a/b;
    	 System.out.println(d);
    	 System.out.println(e);
     } OR */
 finally // madotory ayite finally execute cheyum
 {
	 System.out.println("mandatory things");
	 b=2;
	 int d=a/b;
	 System.out.println(d);
	
 }

	}

}