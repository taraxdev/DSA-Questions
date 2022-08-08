class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprice = 0
        bestpricetobuy = prices[0]
        
        for i in prices:
            if i < bestpricetobuy:
                bestpricetobuy = i
            elif i > bestpricetobuy:
                profit = i - bestpricetobuy
                if profit > maxprice:
                    maxprice = profit
        return maxprice