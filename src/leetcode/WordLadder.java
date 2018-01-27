package leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordLadder {
	public static void main(String[] args) {
		String beginWord="hit";
		String endWord="cog";
		String[] wordList={"hit","dot","dog","lot","log","cog"};
		int count=findPath(beginWord, endWord, wordList);
		
		
	}

	private static int findPath(String beginWord, String endWord,String[] wordList) {
		// TODO Auto-generated method stub
		Set<String> start=new HashSet<String>();
		Set<String> end=new HashSet<String>();
		Iterator<String> iter;
		start.add(beginWord);
		end.add(endWord);
		iter=start.iterator();
		
		while(iter.hasNext())
		{
			char[] charArr=iter.next().toCharArray();
			for(int i=0;i<charArr.length;i++)
			{
				System.out.println(charArr[i]);
				for(char c='a';c<='z';c++)
				{
					
				}
			}
			
			
		}
		//System.out.println(start.iterator().next());
		//System.out.println(iter.next());
		//System.out.println(iter.next());
		//System.out.println(end);
		//for(char c='a';c<='z';c++)
			//System.out.println(c);
		//return 0;
		return 0;
	}
}
