package ibm.com.dmms.training;

import java.util.ArrayList;



public class Homework {

	static void seven()
	{
		ArrayList<Integer> num = new ArrayList<>();
		for(int i =1;i<=100;i++)
		{
			if(i%7==0||String.valueOf(i).contains("7"))
			{
				num.add(i);
			}
		}
		System.out.println(num);
	}
	
	static void maxNum(int a, int b, int c)
	{
		int param = Math.max(a, b);
		System.out.println(Math.max(c, param));
	}
	
	static void transfer(int a)
	{
		System.out.println(	Integer.toBinaryString(a));
	}
	
	static void squre(int a)
	{
		if (a < 0){
			System.out.println("Please input the right number");
			return ;
		}
		System.out.println(Math.sqrt(a));
	}
	
	static void divisor(int a)
	{
		ArrayList<Integer> num = new ArrayList<>();
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				num.add(i);
			}
		}
		System.out.println(num);
	}
	
	static void oddEven(int a)
	{
		if(a%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	
	public static void main(String[] args) {
		seven();
		maxNum(5,7,0);
		transfer(88);
		squre(100);
		divisor(30);
		oddEven(-100);
	}
}
