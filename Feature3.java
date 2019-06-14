package activity;

public class Feature3 
{
  public int mul (int a, int b)
{
	int result=a*b;
	return result;
}
	public static void main(String[] args) 
	{
		
		Feature3 obj=new Feature3();
		int multiplication=obj.mul(10,20);

		System.out.println(multiplication);
	}

}
