
public class SelectionSort 
{
	public static void selectionSort(double [] list1)
	{
		int n = list1.length;
		
		
		for (int i = 0; i< n-1; i++)
		{
			int min = i;
			
			for (int j = i+1; j < n;j++)
			{
				if (list1[j] < list1[min])
				{
						min = j;
				}
			}
			
		}
		
	
	}
}
