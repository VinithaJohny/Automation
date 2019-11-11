
public class SingleArray {

	public static void main(String[] args) {
		int print[]= new int[5];
		SingleArray sa = new SingleArray();
		print[0]=1;
		print[1]=3;
		print[2]=4;
		print[3]=7;
	    print[4]=2;
	    
	    for(int i=0;i<print.length;++i) {
	    	System.out.println(print[i]);
	    }
	    
	    
	    sa.singleNew();
	}
	    
	    public void singleNew()
	    {
	    	int print1[]= {9,8,7,4,1};
	    	System.out.println("\n");
	    	for(int j=0;j<print1.length;++j)
	    	{ 
	    		System.out.println(print1[j]);
	    	}
	    	
	    }

	}


