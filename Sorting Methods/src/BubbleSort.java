
public class BubbleSort 
{
	public static void bubbleSort( String [] list1)
	{
		int i = 0;
		int swap = 0;
		
		while (i<list1.length-1)
		{
			// if the string at position i is towards the beginning of the alphabet more than string at i+1 then switch those 2
			if ( list1[i].compareTo(list1[i + 1]) > 0)
			{
				Swap.stringSwap(list1, i, i+1);
				//counts the amount of time you had to swap the array
				swap ++;
				// after the swap we move on to the next position
				i++;
			}
			// if it is already in alphabetical order we go onto the next position
			else if ( list1[i].compareTo(list1[i + 1]) < 0)
			{
				i++;
			}
			
		}
		//if the amount of times swapped is 0 that means everything is in alphabetical order and we can stop
		if(swap != 0)
		{
		bubbleSort(list1);
		}
	
	}
}
