
public class HV_LongestPalindromicSubSequence {
	public int longestPalindromeSubseq(String s) {
		int[][] m=new int[s.length()][s.length()];
		int k=0;
		while(k<s.length()){
			for(int i=0;(i+k)<s.length();i++)
			{
				if(k==0)
					m[i][i]=1;
				else if(k==1){
					if((i+k)<s.length() && s.charAt(i)==s.charAt(i+1))
						m[i][i+1]=2;
				}
				else
				{
					if((i+k)<s.length() && s.charAt(i)==s.charAt(i+k))
						m[i][i+k]=2+m[i+1][i+k-1];
					else if((i+k)<s.length())
						m[i][i+k]=Math.max(m[i+1][i+k], m[i][i+k-1]);
				}
				i++;	
			}
			k++;
		}
		return m[0][s.length()-1];
	}
	
}
