def InsertionSort(lst):
    for i in range(1, len(lst)):
        temp = lst[i]
        for j in range(i-1, -1, -1):
            if lst[j]>temp:
                lst[j+1] =lst[j]
                if j == 0:
                    lst[j] = temp
            else:
                lst[j+1] = temp
                break

test = [5,2,7,9,1,11,2,0,19,2,111,4,5,2,99]
InsertionSort(test)
print(test)