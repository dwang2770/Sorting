//Dave Wang 2/1/18
//Lab 3.1 Sorting
//Website used : geeksforgeeks.org
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
			//j is i +1 since we want to compare the values after i
			for (int j = i+1; j < n;j++)
			{
				//if value at j is less than the minimum value, the minimum value becomes value at j
				if (list1[j] < list1[min])
				{
						min = j;
				}
			
			}
			//once we are through with the second for loop and made sure we have the minimum value we swap the min and i
			/*how the code works
			 *example array = {7,3,6,5}
			 * we would start at 7 and compare 7 with 3, since 3 is smaller than 7 3 becomes the new minimum
			 * we then go through the rest of the array to check if any value is smaller than 3
			 * we then swap 7 and 3
			 */
			
			Swap.doubleSwap(list1, min, i);
		}
		
	
	}
}
