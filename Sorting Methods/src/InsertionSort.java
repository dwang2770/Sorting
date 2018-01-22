
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
			//j is the value we want to compare i with so it will be i-1
			int j = i-1;
			
			//this while loop makes it so that when we find a value that is less than the value at j, it will push all the values forward by one
			//for example we have array of 3, 7, 6, 5, 
			//when test[i] is 6, since 6 is smaller than 7 but bigger than 3, it will only push 7 forward by one
			while (j>=0 && test[j] > value)
			{
				//swaps the positions to make it go forward
				Swap.intSwap(test,  j, j+1);
				//one is subtracted from j since we are going backwards in the array to push the values greater than test[i] forward
				j=j-1;
			}
			//once everything is pushed forwards, the value after j will be the new value to be tested
			test[j+1] = value;
		}
	 }
}
