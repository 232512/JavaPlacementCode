//Write a java program to performe the multiple inheritance
interface Apple{
	void show();
	
}
interface Ball{
	void disp();
}
public class Inheritance_Multiple1 implements Apple,Ball {
	public void show() {
		System.out.println("This is A Interface");
	}
	public void disp() {
		System.out.println("This is B Interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance_Multiple1 si=new Inheritance_Multiple1();
		si.show();
		si.disp();
		

	}

}
