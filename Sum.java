public class Sum  
{
	public static void main(String[] args) {
		int num = 5;
		int rez = 0;
		while(num>0)
		{
			rez += num;
            num-- ;

		}
		System.out.println(rez);
	}
}