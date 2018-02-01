//Dave Wang 2/1/18
//Lab 3.1 Sorting
public class Runner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double [] test2 = {1.1,4.1,4.2,5.0,2.0,4.0,3.0,17.0,0.0};
		int [] test1 = {1,4,4,5,2,4,3,17,0};
		String [] test3= {"zebra","tortilla","abba","foo","bar","aba"};
		
		//time test code
		long start = System.nanoTime();
		InsertionSort.insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");

		start = System.nanoTime();
		BubbleSort.bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + " nanoseconds");
		
		start = System.nanoTime();
		SelectionSort.selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + " nanoseconds");
		
		//prints out sorted string array
		for (String x : test3)
		{
			System.out.print(x + " ");
		}
		System.out.println();
		//prints out sorted double array
		for (double y : test2)
		{
			System.out.print(y + " ");
		}
		System.out.println();
		//prints out sorted int array
		for (int z : test1)
		{
			System.out.print(z + " ");
		}
		System.out.println();
	
	}

}
