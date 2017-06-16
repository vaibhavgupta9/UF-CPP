/*
 * Time complexity: O mn 
 * 
 *  Compare the ith element in both arrays; if element needs to be inserted in array1, swap array1[i] and array2[i], then compare array2[i] with array1[i+1]
 *  and so on. Use -9999999 as boundary element.
 * 
 * */
public class SudeepSolutionBad {
	
	public void swap(int[] nums1, int[] nums2,int  p1,int p2)
    {
        int temp;
        temp = nums1[p1];
        nums1[p1] = nums2[p2];
        nums2[p2] = temp;
        
    }
    
    
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
      for(int i=m; i<nums1.length; i++)
      {
          nums1[i] = -9999999;
      }
           
      int pt1 = 0;
      int pt2 = 0;
      
      while(pt2 < n)
      {   
          if(nums2[pt2] == -9999999)
          {
              pt2++;
              continue;
          }
          
          if(nums1[pt1] <= nums2[pt2] && nums1[pt1] != -9999999)
           {
               pt1++;
               continue;
           }
          else if(nums1[pt1] > nums2[pt2] || nums1[pt1] == -9999999)
          {
              swap(nums1, nums2, pt1, pt2);
              pt1=0;
              continue;
          } 
      }
    }

}
