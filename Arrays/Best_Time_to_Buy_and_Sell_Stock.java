// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

//----------------------------------------------------------------------------------------------------------------------------------------------

// Approach
// Initialize variables buy with the first element of the prices array and profit as 0.
// Iterate through the prices starting from the second element.
// Update the buy variable if the current price is lower than the current buying price.
// Update the profit if the difference between the current price and the buying price is greater than the current profit.
// Return the final profit.

class Solution {
    public int maxProfit(int[] prices) {
        int i,buy=prices[0];
        int maxProfit=0;
        for(i=1;i<prices.length;i++)
        {
            if(prices[i]<buy)
                buy=prices[i];
            else if(prices[i]-buy>maxProfit)
                maxProfit=prices[i]-buy;
        }   
        return maxProfit;
    }
}
