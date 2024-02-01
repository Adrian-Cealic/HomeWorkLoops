public class IteratingInts
{
	public static void main(String[] args) {

		int count = 0;

		for (int i=1;i<=5;i++) 
		{
			count++;
			for (int j=1;j<=i;j++) 
			{
				
                System.out.println(count+" ");
			}
			System.out.println();

		}
	}
}