
public class BubbleSort 
{
	public static void bubbleSort( String [] list1)
	{
		int i = 0;
		int swap = 0;
		while (i<list1.length-1)
		{
			if ( list1[i].compareTo(list1[i + 1]) > 0)
			{
				Swap.stringSwap(list1, i, i+1);
				swap ++;
				i++;
			}
			else if ( list1[i].compareTo(list1[i + 1]) < 0)
			{
				i++;
			}
			
		}
		
		if(swap != 0)
		{
		bubbleSort(list1);
		}
	
	}
}
