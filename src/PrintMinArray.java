
public class PrintMinArray {

	public static void main(String[] args) {
		
		/* 4 6 3
		 * 2 5 8
		 * 7 4 10
		 */
		int sort[][]= {{4,6,3},{2,5,8},{7,4,10}};
		int min=sort[0][0];
		int i;
		int j = 0;
		int mincol=0;
		int max=sort[0][mincol];
		for(i=0;i<3;++i)
		{
			for(j=0;j<3;++j)
			{
				
				if(min>sort[i][j])
				{
					min=sort[i][j];
					mincol =j;
					//System.out.println(mincol);
							
				}
			}
		}
		
		System.out.println("Minimum number:"+min);
		for(int k=0;k<3;++k)
		{
			if(sort[k][mincol]>max)
			{
				max=sort[k][mincol];
			}
		}

		System.out.println("max value:"+max);
	}

}
