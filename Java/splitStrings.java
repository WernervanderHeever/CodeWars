/*Description:
Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

solution('abc') // should return ['ab', 'c_']
solution('abcdef') // should return ['ab', 'cd', 'ef']
solution('abc') // should return ['ab', 'c_']
solution('abcdef') // should return ['ab', 'cd', 'ef']
SplitString.Solution("abc"); // should return ["ab", "c_"]
SplitString.Solution("abcdef"); // should return ["ab", "cd", "ef"]*/

public class StringSplit {
    public static String[] solution(String s) {
        //Write your code here
      if(s.length() %2 ==0) //even numbers
      {
        String[] result = new String[s.length()/2];
        int count = 0;
        String x = "";
        int j = 0;
        for(int i = 0; i < s.length(); i++)
        {  
            System.out.print(s.charAt(i));
            x = x + s.charAt(i);
            ++count;
             if(count >= 2)
             {
               System.out.print(" ");
               result[j] = x;
               x = "";
               count = 0;
               j++;
             }
         }
        System.out.print("\n");
        return result;
      }
      else //odd numbers
      {
        s = s + "_";
        String[] result = new String[s.length()/2];
        int count = 0;
        String x = "";
        int j = 0;
        for(int i = 0; i < s.length(); i++)
        {  
             System.out.print(s.charAt(i));
             x = x + s.charAt(i);
             ++count;
             if(count >= 2)
             {
               System.out.print(" ");
               result[j] = x;
               x = "";
               count = 0;
               j++;
             }
         }
        System.out.print("\n");
        return result;
      }
    }
}