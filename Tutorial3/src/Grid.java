
public class Grid {
	public static void main(String[] args)
	{
		System.out.print(printGrid(4,6)+"\t");
		System.out.println();
	}

	
static public int[][] printGrid(int row,int col)
{
	int[][] grid = new int[row][col];
	for(int i = 0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			for(int z=0; z< row*col;z++)
			{
				grid [i][j] = z;
			}
			
		}
	}
	return grid;
		
			
	
}
}
