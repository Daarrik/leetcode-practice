def maxProfit(prices):
  low = prices[0]
  profit = 0
  for i in range(1, len(prices)):
    profit_i = prices[i] - low

    if profit_i > profit:
      profit = profit_i

    if low > prices[i]:
      low = prices[i]

  return profit

print(maxProfit([23,1,5,3,6,4]))