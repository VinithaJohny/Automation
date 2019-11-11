
public class PalindromOrNot {

	public static void main(String[] args) {
	
		String s = "ANNA";
		String rev="";
		int len= s.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev = rev+ s.charAt(i);
		}
System.out.println(rev);
System.out.println(s);

if(rev.equals(s))
{
	System.out.println("palindome");
}

else
{System.out.println("not a palindrome");
	}

	}}
