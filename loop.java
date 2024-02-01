//În metoda main de declarat o variabilă de tip char, inițializată cu o literă. 
//De răspuns la întrebarea: vocală sau consoană prin intermediul
//if-else
//switch

// public class loop
// {
// 	public static void main(String[] args) {
// 		char myChar = 'a';

// 		if(myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u')
// 		{
// 			System.out.println("Vocala");
// 		}
// 		else 
// 		{
// 			System.out.println("Consoana");
// 		}
// 	}
// }

public class loop 
{
	public static void main(String[] args) {
		char myChar = 'a';

		switch(myChar)
		{
		   case 'a':
		   	{
		   		System.out.println("Vocala");
		   		break;
		   	}
		   	case 'e':
		   	{
		   		System.out.println("Vocala");
		   		break;
		   	}
		   	case 'i':
		   	{
		   		System.out.println("Vocala");
		   		break;
		   	}
		   	case 'o':
		   	{
		   		System.out.println("Vocala");
		   		break;
		   	}
		   	case 'u':
		   	{
		   		System.out.println("Vocala");
		   		break
		   	}
		   default : 
		   	{
		   		System.out.println("Consoana");
		   		break;
		   	}

		}
	}
}