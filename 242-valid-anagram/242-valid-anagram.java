class Solution {
    public boolean isAnagram(String s, String t) {
	//First convert string arguement to character array to sort
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
		//sort using method or yourself
        Arrays.sort(c1);
        Arrays.sort(c2);
		//assign sorted character array to new strings
        String s1 = new String(c1);
        String s2 = new String(c2);
		//check if both the string are equals
        if(s1.equals(s2)){ //remember, always use .equals for comparing strings and not '=='
            return true;
        }else{
            return false;
        }
    }
}
//Code Ends