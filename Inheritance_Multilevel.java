//Write a java program to perform the Multilevel inheirtance
class A{
	int a,b,c;
	void add() {
		a=10; b=20;
		c=a+b;
		System.out.println("Sum of two numbers:"+c);
	}
	void sub() {
		a=100; b=200;
		c=a-b;
		System.out.println("Subtract of two numbers:"+c);
	}
}
class B extends A{
	void mul() {
		a=29;
		b=45;
		c=a*b;
		System.out.println("Multiplication of two numbers:"+c);
	}
	void div() {
		a=20;
		b=2;
		c=a/b;
		System.out.println("Division of two numbers:"+c);
	}
}
class C extends B{
	void rem() {
		a=20;
		b=3;
		c=a%b;
		System.out.println("Remainder of two numbers:"+c);
	}
}
public class Inheritance_Multilevel  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.rem();

	}

}
