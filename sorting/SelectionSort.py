def swap(lst, i, j):
    temp = lst[i]
    lst[i] = lst[j]
    lst[j] = temp

def selectionSort(lst):
    for i in range(0, len(lst)-1):
        min = i
        for j in range(i+1, len(lst)):
            # Changing this to <= will still work 
            # but it will be unstable sort
            if lst[j]<lst[min]:
                min = j;
        swap(lst, i, min) 

test = [1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44]
selectionSort(test)
print(test)