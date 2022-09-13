 import java.util.Scanner;
class Reverse
{
    public static void main(String[] args) {
        int x;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=s.nextInt();
		 int rev=0;
		 int ld;
		 
		while(x!=0)
		{
		ld=x%10;
		rev=rev*10+ld;
		x=x/10;
		}
		System.out.println("The Reverse of number is :"+rev);
		 
}
}