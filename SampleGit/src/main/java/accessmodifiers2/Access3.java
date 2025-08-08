package accessmodifiers2;

import accessmodifiers.Access1;

public class Access3 extends Access1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access3 obj=new Access3();
		obj.display();
		//obj.display1(); cannot access outside the package - private
		obj.display2();
		//obj.display3(); cannot access outside the package - default
		
		Access1 obj1=new Access1();
		obj1.display();
		//obj1.display1();
		//obj1.display2(); it can be accessed only vi child class object
		//obj1.display3();
	}

}
