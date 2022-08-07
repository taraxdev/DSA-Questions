class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        ist=[]
        total = 0
        for i in range(len(nums)):
            total = total + nums[i]
            ist.append(total)
            
        return ist