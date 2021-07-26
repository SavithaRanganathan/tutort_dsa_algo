class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum1=0,sum2=0;
        for(int i=0,j=accounts.length-1;i<accounts.length && j>=i;i++,j--){
            for(int k=0;k<accounts[i].length;k++){
                sum1=sum1+accounts[i][k];
                sum2=sum2+accounts[j][k];
            }
            if(max < sum1)max=sum1;
            if(max < sum2)max=sum2;
            sum1=0;
            sum2=0;
        }
        return max;
        
    }
}