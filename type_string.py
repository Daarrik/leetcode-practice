def type_string(string: str):
  alphabet = 'abcdefghijklmnopqrstuvwxyz'
  time = 0
  current_letter = 0
  for letter in string:
    letter_index = alphabet.index(letter)
    time += abs(letter_index - current_letter)
    current_letter = letter_index
  return time

print(type_string('cba'))