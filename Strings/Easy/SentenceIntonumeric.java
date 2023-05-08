public class SentenceIntonumeric {

    public static String Numeric(String arr[], String input)
    {

        String output= " "; 
        int n= input.length();
        for(int i=0 ; i<n;i++)
        {
            if(input.charAt(i)==' ')
            {
                output+="0";
            }
            else {

            int pos = input.charAt(i) - 'A';
            output+=arr[pos];
            }
        }
        return output.toString();
    }
    public static  void main(String args[])
    {
        String str[]={"2",    "22",  "222", "3",   "33", "333",
        "4",    "44",  "444", "5",   "55", "555",
        "6",    "66",  "666", "7",   "77", "777",
        "7777", "8",   "88",  "888", "9",  "99",
        "999",  "9999"};

        String input="PARTH";
        System.out.println(Numeric(str, input));
    }
    
}
