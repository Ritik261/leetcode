class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    
        int fb = numBottles;
        int ans = fb;
        int eb = numExchange;
        while(fb >= eb){

            ans += fb /eb;
            fb = (fb/eb) + (fb % eb);

        }

    return ans;
    }
}