package gcfAlgorithm;

public class EuclidGCF 
{
	public int gcfABC(int a, int b)
	{
		int gcf = a;
		
		while(a != b)
		{
			if (b > a)
			{
				b = b - a;
			}
			else
			{
				a = a - b;
			}
		}
			
		return gcf;
	}
}
