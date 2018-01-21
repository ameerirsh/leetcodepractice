package leetcode;

public class ArrayUnionIntersection {
public static void main(String args[])
{
	int arr1[]={1,2,3,4,5,6,9,10};
	int arr2[]={3,5,9,11,13};
	//union(arr1,arr2);
	intersection(arr1,arr2);
}

private static void intersection(int[] arr1, int[] arr2) {
	// TODO Auto-generated method stub
	int i=0;
	int j=0;
	int length1=arr1.length;
	int length2=arr2.length;
	while(i<length1 && j<length2)
	{
		if(arr1[i]==arr2[j])
		{
			System.out.println(arr1[i]);
			j++;
		}
		else
			i++;
	}
	
}

private static void union(int[] arr1, int[] arr2) {
	// TODO Auto-generated method stub
	
	int i=0;
	int j=0;
	int length1=arr1.length;
	int length2=arr2.length;
	while(i<length1 && j<length2)
	{
		if(arr1[i]<arr2[j])
		{
			//System.out.println("value of i:  "+i+"  "+arr1[i++]+"  value of i:  "+i);
			System.out.println(arr1[i]);
			i++;
		}

		else if(arr2[j]<arr1[i])
		{
			//System.out.println(arr2[j++]);
			System.out.println(arr2[j]);
			j++;
		}
			
		else
		{
			System.out.println(arr2[j++]);
			i++;
		}
	}
	while(i<length1)
		System.out.println(arr1[i++]);
	while(j<length2)
		System.out.println(arr2[j++]);
}
}
