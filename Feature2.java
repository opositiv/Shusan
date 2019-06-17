package activity;

public class Feature2 {

	  public int sub(int a, int b)
	{
		int result=a-b;
		return result;
	}
		public static void main(String[] args) 
		{
			// merged to develop branch.
                        // Testing done and bug fixed.
			Feature2 obj=new Feature2();
			int subtract=obj.sub(10,20);

			System.out.println(subtract);
		}

}
