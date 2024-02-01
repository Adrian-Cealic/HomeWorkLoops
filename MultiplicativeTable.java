public class MultiplicativeTable 
{
	public static void main(String[] args) {
		int n = 5;
		int i = 0;

		while(i<10)
		{
			i++;
			int rez = n*i;
			System.out.println(n+" * "+i+" = "+rez);
		}
	}
}