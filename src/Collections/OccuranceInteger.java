package Collections;

import java.util.ArrayList;

public class OccuranceInteger {

	public static void main(String[] args) {
		int ar[]= {7,8,4,4,4,3,10,1,8};
		ArrayList <Integer> ab = new ArrayList<Integer>();
		
		for(int i=0;i<ar.length;++i)
		{
			int count=0;
			if(!ab.contains(ar[i]))
			{
				ab.add(ar[i]);
				count++;
			
			
			for(int j=i+1;j<ar.length;++j)
			{
				if(ar[i]==ar[j])
				{   
					count++;
				}
				
			}
			
			System.out.println(ar[i]+" "+"occured"+ " "+count);
			
			
			}
			
		}
		
	}}
			
			
			
		
	
		
		

	


