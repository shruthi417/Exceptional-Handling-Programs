package pack1;

public class EHandlingAndFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[6];
		try
		{
			a[7] = 22;	
		}
		catch(Exception e)  //This can handle any no. of exceptions
		{
			System.out.println("Exception");
		}
		finally
		{
			System.out.println("Finally block always executes");
		}


	}

}
