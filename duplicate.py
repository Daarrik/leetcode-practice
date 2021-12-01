def contains_duplicate(nums):
  test = {}
  for num in nums:
    print(test)
    if num in test:
      return True
    test[num] = True
  return False

print(contains_duplicate([1, 2,4, 1]))