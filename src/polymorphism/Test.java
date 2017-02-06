/**
 * Copyright 2016-2017 Shyam Bhimani
 */

package polymorphism;

public class Test {

	
	public static void main(String[] args) {
		
		Car car = new Car();
		BMW bmw = new BMW();
		Mercedes mercedes = new Mercedes();
		
		//Upcasting 
		//Reference variable of parent class (car) is referring to the object of child class(mercedes)
		Car c1 = mercedes;
		
		c1.run();
		
		//Reference variable of parent class (car) is referring to the object of child class(bmw)
		Car c2 = bmw;
		
		c2.run();
		
		
		
		
		

	}

}
