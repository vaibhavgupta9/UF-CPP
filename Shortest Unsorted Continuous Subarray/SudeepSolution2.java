/*
 * O(n) solution
 *  
 * Find local maximum for every i elements from left to right; if number less than max, mark it as current end and find the rightmost such endpoint.
 * This marks the rightmost boundary of the solution. Do the same with local minimum from right to left, this marks the leftmost boundary of the solution
 * Return start and end  
 * 
 * */
public class SudeepSolution2 {
	
	public static int findUnsortedSubarray(int[] nums) 
    {
        
      int start = -1;
      int end = -1;
      int max = -99999;
      int min = 99999;
      for(int i=0; i<nums.length; i++)
      {
         int j = nums.length-i-1;
         
         if(max <= nums[i])
          max = nums[i];
         else end = i; 
         
         if(min >= nums[j])
          min = nums[j];
         else start = j;
           
           //System.out.println(end+" "+start);
           //System.out.println(max+" "+min);
      }
      
      if(start == -1)
       return 0;
      
      return end - start +1; 
      
    }
    
}
