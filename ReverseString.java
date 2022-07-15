package Week1Day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "I will learn coding";
char[] ch = str.toCharArray();
int length = ch.length;
for(int i=ch.length-1; i>=0;i--)
{
	System.out.println(ch[i]);
}
	}
	

}
