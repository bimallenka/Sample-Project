package java_prog;

// first name and last name and age .
// Print hello i am first name and last name .
// print i am age years old.

class Person {

	String firstname;
	String lastname;
	int Age;
	
	//Default Constructor 
	
	Person(){
		
		firstname = "firstname name not provided";
		lastname = "lastname not provided";
		Age=0;
	}
	
	//parameterised constructor
	
	Person(String fname, String lname, int age){
		
		firstname= fname;
		lastname=lname;
		this.Age=age;
		
	}
	
	void Printall(){
		
		System.out.println("hello i am"+ " " + firstname + " " + lastname);
	    System.out.println("i am"+" " +Age+ " " + "years old");
	}
}
