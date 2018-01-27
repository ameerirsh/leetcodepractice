package leetcode;

public class SubArrayProdMax {
public static void main(String[] args) {
	int[] arr={2,3,-2,4,-2,5,2};
	int product = maxProduct(arr);
	System.out.println("max product is :"+product);
	
}

private static int maxProduct(int[] arr) {
	// TODO Auto-generated method stub
	int prod=arr[0];
	int result=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		
		prod=prod*arr[i];
		//System.out.print("product is:  "+prod+"  ");
		if(prod>result)
		{
			result=prod;
			//System.out.print("result is:  "+result+"  \n");
		}
		else if(prod<result)
		{
			prod=arr[i];
			result=arr[i];
		}
	}
	return result;
}
}
