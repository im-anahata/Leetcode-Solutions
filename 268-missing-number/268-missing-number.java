class Solution {
    public int missingNumber(int[] nums) {
        int l,i,mid,first,last;
        l = nums.length;
        i=0;
        Arrays.sort(nums);   
        while(i<l){
            first=0;
            last = l-1;
        mid = (first + last)/2;  
   while( first <= last ){  
      if ( nums[mid] < i ){  
        first = mid + 1;     
      }else if ( nums[mid] == i ){    
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      break;
   } 
            i++;
            
        }
        return i;
        
    }
}