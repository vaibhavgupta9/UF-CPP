package java_code;

/*
 * 
 * Find a possible solution by finding inflections from both sides; get the maximum and minimum rom that array and see if sorting this array sorts the entire array;
 * if not expand the current array
 * 
 * O(n) time
 * 
 * */
public class SudeepSolution1 {

	public static int findUnsortedSubarray(int[] nums)
    {
        int start = -1;
        int n = nums.length;
        int end = n-1;
        
        for(int i=0; i< n-1; i++)
        {
            if(nums[i] > nums[i+1])
             {start = i;
              break;
             }
        }
        
        if(start == -1)
         return 0;
        
        for(int i=n-1; i>0; i--)
        {
            if(nums[i-1] > nums[i])
             {end = i;
              break;
             }
        }
        
        //System.out.println(start);
        //System.out.println(end);
        int max = -99999;
        int min = 99999;
        
        for(int i = start; i<= end; i++)
        {
          if(nums[i] > max)
           max = nums[i];
         if(nums[i] < min)
           min = nums[i];
        }
        
        //System.out.println(min);
        //System.out.println(max);
        
        for(int i =0; i<start; i++)
        {
         if(nums[i] > min)
          {
           start = i;
           break;
          }
        }
        
        for(int i=n-1; i>=end+1;i--)
        {
            if(max > nums[i])
             {
              end = i;
              break;
             } 
        }
        
         System.out.println(nums[start]);
        System.out.println(nums[end]);
        
        return end - start +1;

    } 

}
