class Solution {
    public boolean isPalindrome(String s) {
        int left =0;
        int right = s.length()-1;
        while(left<right){
            char temp1 = Character.toUpperCase(s.charAt(left));
            char temp2 = Character.toUpperCase(s.charAt(right));
            if(Character.isLetterOrDigit(temp1)==false){
                left++;
                continue;
            }
            if(Character.isLetterOrDigit(temp2)==false){
                right--;
                continue;
            }
            if(temp1!=temp2){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

}
