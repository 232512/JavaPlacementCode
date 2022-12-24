//Write a java program to perform the single level inheritance
class ExampleSingleLevel{
	public int rollno;
	public String name;
	void demo() {
		System.out.println("This is the Base Class:");
		System.out.println("roll number is :"+rollno+" Name is "+name);
	}
}

public class Inheritance_SingleLevel extends ExampleSingleLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_SingleLevel is=new Inheritance_SingleLevel();
		is.rollno=10;
		is.name="Arun";
		is.demo();
		
		
		

	}

}
