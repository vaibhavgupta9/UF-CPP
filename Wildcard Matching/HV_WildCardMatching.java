public class HV_WildCardMatching {
	public boolean isMatch(String s, String p) {
        int i=0,j=0,star=-1,starptr=-1;
        while(i<s.length()){
        	if(j<p.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'))
        	{
        		i++;
        		j++;
        	}
        	else if(j<p.length() && p.charAt(j)=='*'){
        		star=j;
        		starptr=i;
        		j++;
        		i++;
        	}
        	else if(star!=-1){
        		i=starptr+1;
        		j=star;
        	}
        	else
        		return false;
        }
        return true;
    }
}
