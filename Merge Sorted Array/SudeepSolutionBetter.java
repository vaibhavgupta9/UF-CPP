/*
 *  O(n) time solution, iterate from the end of both arrays and insert elements in descending order to the end of the fist element
 * */
public class SudeepSolutionBetter {
	public void betterMerge(int[] nums1, int m, int[] nums2, int n)
    {
    	 if(m == 0)
         {
            for(int i =0;i<n;i++)
             nums1[i] = nums2[i];
            return;    
         }
         
         int pt1 = m-1;
         int pt2 = n-1;
         
         int insertPtr = m+n-1;
         
         while(pt2 >=0 && insertPtr >=0)
         {
             if(nums1[pt1] > nums2[pt2])
             {
                 nums1[insertPtr] = nums1[pt1];
                 nums1[pt1] = -9999999;
                 if(pt1 > 0)
                     pt1 --;
                 //System.out.println(pt1);    
             }
             else if(nums2[pt2] >= nums1[pt1])
             {
                 nums1[insertPtr] = nums2[pt2];
                 pt2--;
             }
             
             insertPtr--;
         }  	
    }
}
