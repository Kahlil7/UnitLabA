
public class Calculator {

	int num1,num2;
	String strConnectString;
	
	Calculator(int num1, int num2)
	{
		System.out.println("In the constructor");
		this.num1 = num1;
		this.num2 = num2;
	}
	
	int Add()
	{
		System.out.println("In the Add method");
		return num1+num2;
		//return 0;
	}
	int Subtract()
	{
		System.out.println("In the Subtract method");
		return num1-num2;
	}
	int Divide()
	{
		System.out.println("In the Devide method");
		return num1/num2;
	}
	boolean validate()
	{
		System.out.println("In the Validate method");
		if(num1> 0 && num2 > 0)
			return true;
		else
			return false;
	}
	int multiply()
	{
		return num1*num2;
	}
	void ReleaseObject()
	{
		System.out.println("Release Object");
	}
	void OpenDBConnection()
	{
		System.out.println("Open Database Connection");
	}
	void CloseDBConnection()
	{
		System.out.println("Close Database Connection");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
