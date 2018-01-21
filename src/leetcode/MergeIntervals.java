package leetcode;

public class MergeIntervals {
	public static void main(String[] args) {
		//int arr[][]=new int[4][2];
		int arr[][]={{1,3},{2,6},{8,10},{15,18}};
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				
				System.out.print(arr[i][j]+" ");
				if (j==1)
					System.out.println();
			}
		}
		mergeIntervals(arr);
	}

	private static void mergeIntervals(int[][] arr) {
		// TODO Auto-generated method stub
		
		
	}
}
