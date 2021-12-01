def validate_subsequence(array, sequence):
  check = []
  sub_index = 0
  for i in range(len(array)):
    if sub_index == len(sequence): break
    if array[i] == sequence[sub_index]:
      print(sub_index)
      sub_index += 1
      check.append(array[i])
  
  print(array)
  print(sequence)
  print(check)
  if check == sequence:
    return True
  else:
    return False

array = [1,1,1,1,1]
sequence = [1,1,1]
print(validate_subsequence(array, sequence))