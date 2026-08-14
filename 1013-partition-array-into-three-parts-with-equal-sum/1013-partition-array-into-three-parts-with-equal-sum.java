class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        if(sum%3 != 0) return false;
        int reqSum = sum/3;
        int count = 0;
        int sum1 = 0;
        for(int i = 0; i<arr.length-1; i++){
            sum1 += arr[i];
            if(sum1 == reqSum){
                count++;
                sum1 = 0;
                if(count == 2) return true;
            }
        }
        return false;
    }
}