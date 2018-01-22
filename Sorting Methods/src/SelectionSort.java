
public class SelectionSort 
{
	public static void selectionSort(double [] list1)
	{
		int n = list1.length;
		
		//this for loop goes through every position of the array
		for (int i = 0; i< n-1; i++)
		{
			//each increment of i will be the index for the "minimum" value so we can use it to compare to other values
			int min = i;
			
			//this for loop checks the value at index j to the value at the minimum
			//j is i +1 since we want to compare the value after i
			for (int j = i+1; j < n;j++)
			{
				//if value at j is less than the minimum value the minimum value becomes value at j
				if (list1[j] < list1[min])
				{
						min = j;
				}
			
			}
			//once we are through with the second for loop and made sure we have the minimum value we swap the min and i
			Swap.doubleSwap(list1, min, i);
		}
		
	
	}
}
