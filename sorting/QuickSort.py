def quickSortLomuto(lst, start, end):
    if(start>end):
        return
    pivotIndex = lomutoPartition(lst, start, end)
    quickSortLomuto(lst, start, pivotIndex-1)
    quickSortLomuto(lst, pivotIndex+1, end)

# Lomuto's partitioning
def lomutoPartition(lst, s, e):
    pivot = lst[s]
    i=s;
    j = s+1;
    while j<=e:
        if lst[j] < pivot:
            i+=1
            lst[i], lst[j] = lst[j], lst[i]
        j+=1
    lst[i], lst[s] = lst[s], lst[i]
    return i

def quickSortHoares(lst, start, end):
    if(start>=end):
        return
    pivotIndex = hoaresPartition(lst, start, end)
    quickSortHoares(lst, start, pivotIndex)
    quickSortHoares(lst, pivotIndex+1, end)

# Hoare's partitioning
def hoaresPartition(lst, s, e):
    pivot = lst[s]
    i = s-1
    j = e+1
    while True:
        while True:
            i+=1
            if lst[i]>=pivot:
                break
        while True:
            j-=1
            if lst[j]<=pivot:
                break
        if i>=j:
            return j
        lst[i], lst[j] = lst[j], lst[i]

testL = [100,1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44,8]
quickSortLomuto(testL, 0, len(testL)-1)
print(testL)

testH = [100,1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44,8]
quickSortLomuto(testH, 0, len(testH)-1)
print(testH)