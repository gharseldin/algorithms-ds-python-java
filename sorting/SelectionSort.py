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
                min = j
        swap(lst, i, min) 

# Recursive solution
def recursiveSelectionSort(n, lst):
    if n == len(lst):
        return
    min = n
    for j in range(n+1, len(lst)):
        if lst[j]<lst[min]:
            min = j
    swap(lst, n, min)
    recursiveSelectionSort(n+1, lst)


test = [1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44]
recTest = [1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44]
selectionSort(test)
recursiveSelectionSort(0, recTest)
print(test)
print(recTest)