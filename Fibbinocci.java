package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start= 0;
		int next = 1 ;
		int series = 0;
		System.out.println(series);
		System.out.println(next);
		for(int i=1;i<=9;i++)
		{
		 series = start+next;
		 start = next ;
		 next = series ;
		  System.out.println(series);

		 }
	}

}
