class SortColors{
    public void sortColors(int[] nums) {
        
        int start =0;
        int end =nums.length -1;
        int index =0;
        
        
        while(start < end && index<= end){
            
            if(nums[index] == 0){
                
                nums[index] = nums[start];
                nums[start] = 0;
                index ++;
                start++;
                
            }else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] =2;
                end--;
            }else{
                index++;
            }
            
        }
        
    }
}