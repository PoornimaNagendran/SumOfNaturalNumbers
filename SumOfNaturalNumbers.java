package guvi;
import java.util.*;
public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=s.nextInt();
		int sum=0;
		if(n<=0)
		{
			System.out.println("Enter only the natural numbers");
			
		}
		else
		{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The sum of "+n+" natural numbers are "+sum);
	}

}
}
