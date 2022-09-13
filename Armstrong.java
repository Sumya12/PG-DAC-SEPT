 import java.util.Scanner;
class Armstrong
{
    public static void main(String[] args) {
        int x;
		int count=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=s.nextInt();
		int temp1=x;
		while(temp1>0)
		{
		 temp1=temp1/10;
		 count++;
		}
		int ld;
		int arm=0;
		int mul=1;
		int temp2=x;
		while(temp2!=0)
		{  
		ld=temp2%10;
		for(int i=1;i<=count;i++)
		{
		mul=mul*ld;
		}
		arm=arm+mul; 
        }
		if(arm==x)
		System.out.println("The given no is Armstrong number:");
	    else 
		System.out.println("The given no is not a  Armstrong number:");
}
}