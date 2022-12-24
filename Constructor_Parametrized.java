//Write a java program to perform the parameterized constructor
class ParameterExample{
	int x,y;
	ParameterExample(int a,int b){
		x=a;
		y=b;
		
	}
	ParameterExample(int a,String b){
		System.out.println(a+" "+b);
	}
	void show() {
		System.out.println(x+" "+y);
	}
}

public class Constructor_Parametrized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterExample st=new ParameterExample(100,200);
		ParameterExample st1=new ParameterExample(100,"Arun");
		st.show();
		

	}

}
