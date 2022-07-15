package Week1Day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] value1 = {3,2,5,19,7,4};
int[] value2 = {2,4,11,38,23,5};
int length1= value1.length;
int length2= value2.length;
for(int i=0;i<=length1-1;i++)
{
	for(int j=0;j<=length2-1;j++)
	{
		if(value1[i]==value2[i])
		{
			System.out.println(value1[i]);
			break;
		}
	}
}
	}

}
