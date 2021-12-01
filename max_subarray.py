def max_subarray(nums):
  total = sum(nums)
  l_nums = nums
  r_nums = nums
  for i in range(len(nums)):
    l_nums.pop(0)
    r_nums.pop(-1)
    l_total = sum(l_nums)
    r_total = sum(r_total)
    if l_total > total:
      total = l_total



print(max_subarray([5,4,-1,7,8]))