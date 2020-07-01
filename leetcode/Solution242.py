def isAnagram(self, s, t):
        # populate the countArray
        count = [0] *26
        for i in s:
            count[ord(i)-ord("a")]+=1
            
        # remove from count according to t
        for i in t:
            if count[ord(i)-ord("a")]>0:
                count[ord(i)-ord("a")]-=1
            else:
                # no need to continue since we have an extra character in t
                return False 
        
        # check to make sure count = 0;
        if sum(count)==0:
            return True;
        return False