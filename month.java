package fall2023;



public class month{

	public void sum(int a, int b)

	{

		int s=0;

		for(int i=a; i<b; i++)

		{

			s+=1;

		}

		System.out.println("the value of s is "+ s);

	}

	public static int total(int i1, int i2)

	{

		int sum=0;

		for(int i=i1; i<=i2; i++)

		{

			sum+=i;

		}

		return sum;

	}
	static void display()

	{

		System.out.println("hello!!");

	}

	//method overloading -> same function name with different parameters
	public void addition (int a, int b)
	{
		int c= a+b;
		System.out.println("the addition of a and b is "+ c);
	}
	public void addition (int a, int b, int c)
	{
		int d= a+b+c;
		System.out.println("the addition of d is "+ d);
	}

	public static void main(String[] args) {

		month r=new month();

		r.sum(10, 20);

		

		System.out.println("the sum from 1 to 10 is "+ total(1, 10));

		System.out.println("the sum from 10 to 20 is "+ total(10, 20));

		System.out.println("the sum from 20 to 30 is "+ total(20, 30));

		display();

	}



}