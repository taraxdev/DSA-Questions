class Solution:
    def romanToInt(self, s: str) -> int:
        lookUp={
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }
        intValue = 0
        stringlen = len(s)-1
        for index in range(stringlen,-1,-1):
            if index<stringlen and lookUp[s[index]] < lookUp[s[index+1]]:
                intValue = intValue - lookUp[s[index]]
            else:
                intValue = intValue + lookUp[s[index]]
        return intValue