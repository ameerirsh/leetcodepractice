package leetcode;

public class ArraySingleNumber {
	/*
	 * all numbers have duplicates, find the one that doesnt have
	 */
public static int singleNumber(int[] nums){
	
	try
	{
		for(int i=0;i<nums.length;i++)
		{
			if(i==nums.length-2)
			{
				System.out.println("value of i   "+i);
				//return nums[nums.length];
			}
			else if(i<nums.length-1)
				if(nums[i]-nums[i+1]==0)
				{
					i++;
				}					
				else
				{
					return nums[i];
				}	
		}
	}
	catch (Exception e)
	{
		System.out.println(e.toString());
	}
	
	return 0;
        
    }

public static void main(String args[])
{
	int arr[]={1,1,2,2,3,3,4,4,5,5,6};
	int singleNum=singleNumber(arr);
	System.out.println(singleNum);
}
}
