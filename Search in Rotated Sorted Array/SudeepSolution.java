/*
 * 
 * O(n) time worst case, O(log n) average case, find the half of array which is in normal sorted order and binary search in there; if not found
 * binary search through the remaining half. CTCI problem 10.3 
 * 
 * */
public class SudeepSolution {
	
	public static int search(int[] nums, int target) 
    {
      return binarySearch(nums, 0, nums.length-1, target);   
    }
    
    public static int binarySearch(int []nums, int left, int right, int target)
    {   
    	if(right < left || nums.length == 0)
            return -1;
    	
        int mid = (left + right)/2;
        
        if(target == nums[mid])
          return mid;
        
        if(nums[left] < nums[mid])
            {
                if(target >= nums[left] && target < nums[mid])
                  return binarySearch(nums, left, mid-1, target);
                
                else
                  return binarySearch(nums, mid+1, right, target);    
            }
            
            else if(nums[mid] < nums[right])
            {
                if(target <= nums[right] && target > nums[mid])
                  return binarySearch(nums, mid+1, right, target);
                
                else 
                   return binarySearch(nums, left, mid-1, target);
            }
            
            else if(nums[left] == nums[mid])
            {
                if(nums[right] != nums[mid])
                {
                    return binarySearch(nums, mid+1, right, target);
                }
                
                else
                {
                    int check = binarySearch(nums, left, mid-1, target);
                    if(check == -1)
                      return binarySearch(nums, mid+1, right, target);
                    else return check;  
                }
            }
            
            return -1;
    }

}
