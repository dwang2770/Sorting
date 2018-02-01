//Dave Wang 2/1/18
//Lab 3.1 Sorting
public class Swap 
{
	//swaps 2 ints
	public static void intSwap (int [] arr, int index1, int index2)
	{
		int y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
	
	//swaps 2 strings
	public static void stringSwap( String [] arr, int index1, int index2)
	{
		String y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
	
	//swaps 2 doubles
	public static void doubleSwap (double [] arr, int index1, int index2)
	{
		double y = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = y;
	}
}
