package pack1;

public class EHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[6];
		try
		{
			a[7] = 22;	
		}
		/*catch(Exception e)  //This can handle any no. of exceptions
		{
			System.out.println("Exception");
		}*/
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
		

	}

}
