class twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int sub=Math.abs(nums[i]-target);
            if(hash.containsKey(sub) && hash.get(sub) != i){
                arr[0]=i;
                arr[1]=hash.get(sub);
                break;
            }
        }
       return arr; 
    }
}