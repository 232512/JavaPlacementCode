//Write a java program to show Multiple inheritance
class Student{
	int m1,m2;
	void getMarks(int marks1, int marks2) {
		m1=marks1;
		m2=marks2;
	}
	void showMarks() {
		System.out.println("First Marks is "+m1);
		System.out.println("Second Marks is "+m2);
	}
}
interface sport{
	int sp=100;  //final variable
	void Sport(); //abstract method
}
class Result extends Student implements sport{
	public void Sport() {
		System.out.println("Sport marks"+sp);
	}
	void disp() {
		showMarks();
		Sport();
		int tot=m1+m2+sp;
		System.out.println("Total marks is :"+tot);
	}
}
public class Inheritance_Multiple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result obj=new Result();
		obj.getMarks(100, 200);
		obj.disp();
		

	}

}
