
public class MultiArray {

	public static void main(String[] args) {
		MultiArray ma =new MultiArray();
		int print[][]=new int[3][3];
		print[0][0]=7;
		print[0][1]=8;
		print[0][2]=9;
		print[1][0]=4;
		print[1][1]=5;
		print[1][2]=6;
		print[2][0]=1;
		print[2][1]=2;
		print[2][2]=3;
		
		for(int i=0; i<3;++i)
		{
			for(int j=0;j<3;++j)
			{
				
				System.out.println(print[i][j]);
			}
		}
		ma.multiNew();

	}
	
	public void multiNew()
	{
		int i1,j1,i2,j2;
		int print1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		for(i1=0;i1<3;i1++)
		{
			for(j1=0;j1<3;++j1)
			{
				System.out.println(print1[i1][j1]);		
				
			}
		}

		System.out.println(print1[1][1]);
	}

}
