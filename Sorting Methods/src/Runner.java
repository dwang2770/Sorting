
public class Runner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double [] somenumsbutwithadot = {2.1,3.4,5.6,9.2,7.7,5.5};
		int [] somenums = {2,3,5,6,88,10};
		String [] xd= {"c","g","d","a","b","f","h","j"};
		BubbleSort.bubbleSort(xd);
		SelectionSort.selectionSort(somenumsbutwithadot);
		//prints out sorted string array
		for (String x : xd)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		//prints out sorted double array
		for (double y : somenumsbutwithadot)
		{
			System.out.print(y + " ");
		}
		System.out.println();
		//prints out sorted int array
		for (int z : somenums)
		{
			System.out.print(z + " ");
		}
		System.out.println();
	}

}
