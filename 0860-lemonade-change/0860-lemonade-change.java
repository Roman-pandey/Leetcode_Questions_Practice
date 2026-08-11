class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int i = 0; i<bills.length; i++){
            int amount = bills[i];
            if(amount == 5)five++;
            else if(amount == 10){
                if(five == 0) return false;
                five--;
                ten++;
            }
            else if(amount == 20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five<3) return false;
                else five = five-3;
            }
        }
        return true;
        
    }
}