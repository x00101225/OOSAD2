package Singleton;

public class Singleton 
{

	private int numOfInstances;
	private int invokeCounter;
	private static Singleton s = null;
	private Singleton() 
	{ 
		numOfInstances++;
	}

	public static  Singleton create()
	{
	if(instance == null)
		{
			invokeCounter++;
			s = new Singleton();
			System.out.println("Singleton Created!!");
			return s;
		}
	else{
		invokeCounter++;
		System.out.println("Already Created..");
		return s;
	}
	public static int getInnovationCount()
	{
	return invokeCounter;
	}
}
