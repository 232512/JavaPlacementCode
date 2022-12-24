//Write a java program to perform the method overloading
class SuperClass{
	int add() {
		int a=10,b=20,c;
		c=a+b;
		return c;
	}
	void add(int x,int y) {
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x, double y) {
		double c;
		c=x+y;
		System.out.println(c);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass si=new SuperClass();
		si.add(45,34.4);
		int c=si.add();
		System.out.println(c);
		si.add(100,20);

	}

}
