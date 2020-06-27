def countSortNumbers(lst):
    # find the max number in the list
    max = lst[0]
    for i in lst:
        if i>max:
            max = i

    # create a counting list and initialize it
    count = [0] * (max+1)
    for i in lst:
        count[i]=count[i]+1;
    
    # iterate over count and create the result
    result = []
    for i in range(0, len(count)):
        while count[i]>0:
            result.append(i)
            count[i]=count[i]-1
    
    return result

def countSortString(str):
    count = [0] * 26
    for ch in str:
        index = ord(ch)-ord('a')
        count[index] = count[index]+1
    
    result = ""
    for i in range(0, len(count)):
        while count[i]>0:
            c = chr(ord('a')+i)
            result+= c
            count[i] = count[i]-1
    return result

test = [1, 2, 3, 4, 2, 1, 3, 4, 8, 9, 7, 6, 2, 3, 8, 7, 9, 1, 0, 2, 3, 
        4, 7, 8, 9, 0, 2, 8, 3, 1, 4, 6, 7, 2, 9, 3, 1, 0, 8, 4, 7, 1, 2, 3, 4, 9, 8, 7]
print(test)
print(countSortNumbers(test))

testString = "asdklfjhasdlasdflkjasdfasdfkljasdfkjlkzxcvxzcvqwerwerouiyoiuy"
print(testString)
print(countSortString(testString))

    
