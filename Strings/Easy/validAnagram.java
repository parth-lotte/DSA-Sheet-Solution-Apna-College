class Solution {
    public boolean isAnagram(String s, String t) {
        // Convert To Lower case
        String str1= s.toLowerCase();
        String str2=t.toLowerCase();

        // check the length of the str
        // boolean res;
        if(str1.length()==str2.length())
        {
            char [] c1= str1.toCharArray();
            char [] c2= str2.toCharArray();

            // sort the array 

            Arrays.sort(c1);
            Arrays.sort(c2);

            if( Arrays.equals(c1,c2))
            {
                return true;
            }
            

        }
        return false;
    }
}