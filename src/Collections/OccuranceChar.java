package Collections;

import java.util.ArrayList;

public class OccuranceChar {

	public static void main(String[] args) {
		String s= "Vinitha";
		char c[] = s.toCharArray();
		ArrayList <Character>al=new ArrayList<Character>();
		for(int i=0;i<c.length;++i)
		{  int count =0;
			if(!al.contains(c[i]))
			{
				al.add(c[i]);
				count++;
				
				for(int j=i+1;j<c.length;++j)
				{
					if(c[i]==c[j])
					{
						count++;
					}
				}
			System.out.println(c[i]+" "+ "occurance"+" "+count);
			
			if(count>1)
			{
				System.out.println(c[i]+" repeated");
			}
			
			}
		}

	}

}
