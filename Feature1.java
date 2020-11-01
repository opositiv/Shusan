package activity;

public class Feature1 {

	  public int add(int a, int b)
	{
		int result=a+b;
		return result;
	}
		public static void main(String[] args) 
		{
			//bug fix done here
			//production bug fixed (hotfix)
			Feature1 obj=new Feature1();
			int addition=obj.add(10,20);

			System.out.println(addition);
		}

}
