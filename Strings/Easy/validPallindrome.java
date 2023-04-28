public class validPallindrome {
    class Solution {
        public boolean isPalindrome(String s) {
             s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
            int n= s.length();
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)!=s.charAt(n-1-i))
                {
                    return false;
                }
            }
            return true;
        }
    
    }
    
}
