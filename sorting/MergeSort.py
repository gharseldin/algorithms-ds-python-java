def mergeSort(lst, start, end):
    if(start<end):
        mid = start+int((end-start)/2)
        mergeSort(lst, start, mid)
        mergeSort(lst, mid+1, end)
        merge(lst, start, mid, end)

def merge(lst, s, mid, e):
    i = s
    j = mid+1
    result = []
    while i<=mid and j<=e:
        if lst[i]<lst[j]:
            result.append(lst[i])
            i+=1
        else:
            result.append(lst[j])
            j+=1
    while i <= mid:
        result.append(lst[i])
        i+=1
    while j <= e:
        result.append(lst[j])
        j+=1
    counter = 0
    for i in range(s,e+1):
        lst[i] = result[counter]
        counter+=1

test = [100,1,3,5,7,9,2,4,6,8,10,0,12,111,125,333,44,8]
mergeSort(test, 0, len(test)-1)
print(test)