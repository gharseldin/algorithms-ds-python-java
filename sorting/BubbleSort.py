def bubbleSort(lst):
    for i in range(0, len(lst)):
        for j in range(0, len(lst)-i-1):
            if lst[j]> lst[j+1]:
                lst[j], lst[j+1] = lst[j+1], lst[j]

test = [1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44]
bubbleSort(test)
print(test)
