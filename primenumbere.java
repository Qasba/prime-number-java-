import java.io.*;
class PrimeNumber
{
  public static void main(String args[])throws IOException
   {
	BufferedReader ob = new BufferedReader (new InputStreamReader (System.in));
	int i,j=2;
	System.out.println("Enter the number you want to check whether its prime or not...");
	i=Integer.parseInt(ob.readLine());
	if (i == 0)
	{
		System.out.println("You entered zero....invalid input");
	}
	else
	{
		for(j=2;j<i;j++)
		{
			int k = i%j;
			if(k == 0)
			{ 
				System.out.println("Not Prime !");
				break;
			}
		}
		if(j == i)
		{
			System.out.println("Prime Number");
		} 
	}		
   }
}