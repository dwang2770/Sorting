//Dave Wang 2/1/18
//Lab 3.1 Sorting
//Website used : geeksforgeeks.org
public class InsertionSort 
{
	public static void insertionSort(int [] test)
	{
		int n = test.length;
	    //insertion sort starts with the second number so i = 1
		//this for loop goes through all values of the array at position i
		for (int i = 1; i < n; i++)
		{
			int value = test[i];
			//j is the value we want to compare i with, so it will be i-1 since we want to compare numbers before the indicated value
			int j = i-1;
			
			/*this while loop makes it so that when we find a value that is less than the value at j, it will 
			 * continue swapping until we find a value that is less than test[i]
			 */
			//for example we have array of 3, 7, 6, 5, 
			//when test[i] is 6, since 6 is smaller than 7 but bigger than 3, swap 6 and 7 causing it to be 3,6,7,5
			/*this while loop ends once j is less than 0 (meaning we have reached the end of the array and gone out of bounds)
			 * it will also end once we find a test[j] smaller than test[i] 
			 * once we get to 3(test[j]) since 6(test[i]) is greater than 3 there is no reason to swap 3 with 6 since they are already in order
			 */
			while (j>=0 && test[j] > value)
			{
				//swaps the positions to make it in order
				Swap.intSwap(test,  j, j+1);
				/*using our example array
				 * the starting index  is 2 so i=2 thus making j = 1
				 * test[2] is 6 and test[1] is 7
				 * once we put this through the while loop and swap them, we now want to check the values before j 
				 * to see if any are bigger than 6; hence j-1
				 */
				j=j-1;
			}
			
		}
	 }
}
