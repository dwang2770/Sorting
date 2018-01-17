
public class Swap 
{
	public static void intSwap (int [] arr, int index1, int index2)
	{
		int y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}

	public static void stringSwap( String [] arr, int index1, int index2)
	{
		String y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}

	public static void doubleSwap (double [] arr, int index1, int index2)
	{
		double y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
}
