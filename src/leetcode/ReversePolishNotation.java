package leetcode;

public class ReversePolishNotation {
public static void main(String[] args) {
  String[] notation={"2","1","+","3","*"};
  evaluateNotation(notation);
}

private static void evaluateNotation(String[] notation) {
	// TODO Auto-generated method stub
	int[] stack=new int[notation.length];
	//CharSequence operator={"+","-","/","*"};
	CharSequence operator="+-/*";
	for(int i=0;i<notation.length;i++)
	{
		if(notation[i].contains(operator))
		{
			System.out.println("here");
		}
		else
		{
			System.out.println(notation[i]);
			//stack[i]=Integer.parseInt(notation[i]);
		}
		
	}
	int sum=0;
	for(int j=0;j<stack.length;j++)
		sum+=stack[j];
}
}
