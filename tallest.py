def solution(arr):
  rows = []
# traversing through each element in array
  for height in arr:
    found = -1
# checking with already available rows
    for i in range(len(rows)):
      if height < rows[i]:
        found = i
# if that height can be put in already available rows
    if found != -1:
      rows[found] = height
# else create a new row
    else:
      rows.append(height)
# return nno of rows
  return len(rows)

print("Number of rows required: ", solution([5,4,3,6,8,7,1,2,1,2,1,2]))
