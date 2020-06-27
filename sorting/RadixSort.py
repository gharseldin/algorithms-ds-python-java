import math

def RadixSort(lst):

    # first find the largest number
    max = lst[0]
    for i in lst:
        if i>max:
            max = i
    
    # now we find the number of digits in that number
    digits = 0
    while int(max/math.pow(10, digits))>0:
        digits+=1

    # now that we now the number of digits in the max number
    # we will do a count sort for the number of digits
    for digit in range(0, digits):
        countSort(lst, digit)

def countSort(lst, digit):
    # since our numbers are base 10 we will use base 10 counter list
    # if it was hexadecimel like memory addresses we will use base 16 etc
    # every space in the list will be a list as well
    counter = [[]]
    for i in range(0,10):
        row = []
        counter.append(row)

    for i in lst:
        num = int(i/math.pow(10,digit))%10
        row = counter[num]
        row.append(i)
    # now we will return all the values in the original list
    # we iterate from top to bottom because it will cost O(1)
    # to remove an element from the end of a list as opposed to
    # O(n) to remove an element from the start of a list
    index = len(lst)-1
    for i in range(len(counter)-1, -1, -1):
        row = counter[i]
        while len(row)>0:
            lst[index] = row.pop()
            index -= 1


test = [213, 213, 123, 3244, 3278, 93, 21470, 83, 4, 27, 9, 9, 81, 25708, 9, 72, 134, 9807, 12398, 47, 23, 1, 90, 847]
print(test)
RadixSort(test)
print(test)


