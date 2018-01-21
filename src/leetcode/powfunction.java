package leetcode;

public class powfunction {
public static void main(String args[])
{
	double x=2;
	int n=5;
	double result=pow(x,n);
	System.out.println(result);
}

private static double pow(double x, int n) {
	// TODO Auto-generated method stub
	for(int i=0;i<n-1;i++)
	{
		x=x*x;
	}
	return x;
}
}
