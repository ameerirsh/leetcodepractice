package leetcode;

public class SubArraySumMax {

	public static void main(String[] args) {
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		int start=0;
		int end=1;
		int sum=0;
		int res=0;
		/*while(start<=arr.length)
		{
			res=subArray(arr, start,end,sum);
			end++;
			if(end==arr.length-1)
				start++;
		}*/
		for(int i=0;i<arr.length;i++)
		{
			res=subArray(arr, start,end,sum);
			end++;
			if(res>sum)
			{
				sum=res;
			}
			System.out.println("subarray sum is :"+sum);
		}
		
		
	}

	private static int subArray(int arr[],int start, int end,int sum) {
		// TODO Auto-generated method stub
		int subArrSize=(end-start)+1;
		int subArr[]=new int[subArrSize];
		int mainArrIndex=start;
		int subArrSum;
		System.out.println("subarray");
		for(int i=0;i<subArrSize;i++)
		{
			if(!(mainArrIndex>=arr.length))
			{
				subArr[i]=arr[mainArrIndex];
				mainArrIndex++;
				System.out.print(subArr[i]+" ");
			}
			
		}
		subArrSum=findSum(subArr);
		return subArrSum;
		
	}

	private static int findSum(int subArr[]) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<subArr.length;i++)
			sum=sum+subArr[i];
		//System.out.println("sum is :"+sum);
		return sum;
	}
}
