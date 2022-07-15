package Week1Day2;

public class OddIndexUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str ="worksmart";
 char[] ch=str.toCharArray();
 int length = ch.length;
 for (int i=0;i<=length-1;i++)
 {
	 if(i%2!=0)
	 {
		 ch[i]=Character.toUpperCase(ch[i]);
	 }
 }
 
	}

}
