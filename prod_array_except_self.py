def product_except_self(nums):
  length = len(nums)
  prods = [1] * length
  left = 1

  for i in range(length):
    prods[i] = left
    left *= nums[i]
    print(left)
  
  right = 1
  for i in reversed(range(length)):
    prods[i]*=right
    right*=nums[i]
    print(right)
  return prods


print(product_except_self([1,2,3,4]))