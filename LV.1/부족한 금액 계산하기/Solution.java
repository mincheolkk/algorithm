class Solution {
    public long solution(int price, int money, int count) {
    
        long long_price = price, long_money = money, long_count=count;
        long totalPrice = long_price*long_count*(long_count+1)/2;
    
        if (totalPrice - long_money > 0){
            return totalPrice - long_money ;
        } else {
            return 0;
        }
    }
}
