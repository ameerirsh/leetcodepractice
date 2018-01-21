package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class removeduplicatearray {
	public static int removeDuplicates(int[] nums) {
	//	Arraylist<Integer> arrlist=new ArrayList<Integer>(Arrays.asList(nums));
        int dupCount=0;
        for(int i=0;i<nums.length;i++)
        {
            if((i+1)<nums.length)
            {
                if(nums[i]-nums[i+1]==0)    
                {
                    dupCount++;
                }
                else
                {
                	//System.out.println();
                }
                    
            }    
        }
        return dupCount;
    }
	
	public static void main(String args[])
	{
		int arr[]={1,1,2,3,4,4,5,6,7,7,9,10,10,12};
		int count=removeDuplicates(arr);
		System.out.println(count);
	}
	
}
