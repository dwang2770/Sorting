
public class Runner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double [] somenumsbutwithadot = {2.1,3.4,5.6,9.2,7.7,5.5};
		int [] somenums = {2,3,5,6,88,10};
		String [] xd= {"c","g","d","a","b","f","h","j"};
		BubbleSort.bubbleSort(xd);
		for (String x : xd)
		{
			System.out.print(x);
		}
	}

}
