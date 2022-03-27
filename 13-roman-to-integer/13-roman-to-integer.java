class Solution {
    public int romanToInt(String s) {
        int n=0;
        return roman(s,n);
        }
    static int roman(String s,int n){
        if(s.isEmpty()){
            return n;
        }
        if(s.startsWith("CM")){
            return roman(s.substring(2),n+900);
        }
         if(s.startsWith("CD")){
            return roman(s.substring(2),n+400);
        }
         if(s.startsWith("M")){
            return roman(s.substring(1),n+1000);
        }
         if(s.startsWith("D")){
            return roman(s.substring(1),n+500);
        }
         if(s.startsWith("XC")){
            return roman(s.substring(2),n+90);
        }
         if(s.startsWith("XL")){
            return roman(s.substring(2),n+40);
        }
         if(s.startsWith("C")){
            return roman(s.substring(1),n+100);
        }
         if(s.startsWith("L")){
            return roman(s.substring(1),n+50);
        }
         if(s.startsWith("IX")){
            return roman(s.substring(2),n+9);
        }
         if(s.startsWith("IV")){
            return roman(s.substring(2),n+4);
        }
         if(s.startsWith("X")){
            return roman(s.substring(1),n+10);
        }
         if(s.startsWith("V")){
            return roman(s.substring(1),n+5);
        }
        else{
            return roman(s.substring(1),n+1);
        }
    }
    
}