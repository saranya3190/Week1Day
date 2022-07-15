package Week1Day2;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Not getting the expected output
		String str="I am Saranya I am working at Infosys";
	    String split[]=str.split("");
	    int count=0;
	    for (int i=0; i<str.length();i++)
	    {
	    	for(int j=0;j<str.length();j++)
	    	{
	    		if(split[i]==split[j])
	    		{
	    		count++;
	    		split[i]="";
	    		break;
	    		}
	    		if(count>1)
	    		{System.out.println(split[i].replace(split[i], " "));
	    		}
	    		
	    		else
	    			System.out.println(split[i]);
	    		}
	    	}
	    }
	}


