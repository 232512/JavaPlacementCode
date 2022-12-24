//Write a java program to perform the Default Constructor
class DefaultExample{
	int a; String b; boolean c;
	DefaultExample(){   //default constructor
		a=100;
		b="arun";
		c=true;
	}
	void disp() {
		System.out.print(a+" "+b+" "+c);
	}
}
public class Constructor_Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultExample df=new DefaultExample();
		df.disp();
		
		

	}

}
