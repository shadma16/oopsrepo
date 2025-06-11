package mavenproj1;

public class ConsolePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
	     String b=args[1];
	     float c= Float.parseFloat(args[2]);
	     float d = a+c;
	     System.out.println(a);
	     System.out.println(b);
	     System.out.println(c);
	     System.out.println("sum of " +a+ " and " +c+ " is "+d);
	}

}