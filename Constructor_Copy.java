//Write a java program to perform the copy Constructor
class CopyExample{
	int a; String b;
	CopyExample(){
		a=10;
		b="arun";
		System.out.println(a+" "+b);
	}
	CopyExample(CopyExample obj){
		a=obj.a;
		b=obj.b;
		System.out.println(a+" "+b);
	}
}
public class Constructor_Copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyExample st=new CopyExample();
		CopyExample st2=new CopyExample(st);

	}

}
