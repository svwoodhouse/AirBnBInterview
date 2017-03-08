package solution;
/*
1. Given a string, write a function to return whether it is a palindrome or not

Examples: "bob", "gig", "abba"
Non-examples: "firetruck"


2. Given a list of unique words, find the pairs of words that, when concatenated, will form a palindrome. For example:

["gab", "cat", "bag", "alpha"] => [["gab", "bag"], ["bag", "gab"]]


*/

public class Solution{
  
  public static void main(String []args) {
    
    String word = "bob"; // "", "a", "abba"
    String word2 = "firetruck";
    String word3 = "";
    String word4 = "a";
    String word5 = "abba";
    String arr[];
    arr = new String[] {"gab", "cat", "bag", "alpha"};
    
    boolean check1 =  palindromeCheck(word);
    boolean check2 =  palindromeCheck(word2);
    boolean check3 =  palindromeCheck(word3);
    boolean check4 =  palindromeCheck(word4);
    boolean check5 =  palindromeCheck(word5);
    String[] check6 = palindromeListCheck(arr);
    
    System.out.println(check1);
    System.out.println(check2);
    System.out.println(check3);
    System.out.println(check4);
    System.out.println(check5);
    
    for(int i = 0; i < check6.length; i++)
    {
         System.out.println(check6[i]);
    }  
  }
  
  public static boolean palindromeCheck(String w){
    int length = w.length();
    int x = length-1;
    
    char[] c = w.toCharArray();
    char[] backwards = new char[length];
    
  for(int i = 0; i < length; i++)
    {
      backwards[i] = c[x];
      x-=1;                 
    }
    
    String origWord = String.valueOf(c);
    String backWord = String.valueOf(backwards);
    
    if(origWord.equals(backWord))
    {
      return true;
    }
    else
      return false;
  }
  
  public static String[] palindromeListCheck(String[] words)
  {
    int length = words.length;
    String concat = "";
    int x = 0;
    String ans[] = new String[length];
    Boolean check;
    
    for(int i = 0; i < length; i++)
    {
        for(int j = 0; j < length; j++)
        {
            if(i == j || j == i)
                break;
            
            concat = words[j].concat(words[i]);
            System.out.println(concat);
            check = palindromeCheck(concat);      
            
            if (check == true)
            {
                ans[x] = words[j];
                ans[x+1] = words[i];
                x+=2;
            }
        }
    }
    return ans;
  }
}