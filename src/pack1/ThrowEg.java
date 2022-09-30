package pack1;

public class ThrowEg {
	static void age(int a)
	{
		if(a < 18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age(22);
		System.out.println("next");

	}

}
