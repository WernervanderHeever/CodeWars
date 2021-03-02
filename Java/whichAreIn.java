/*Description:
Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.

#Example 1: a1 = ["arp", "live", "strong"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns ["arp", "live", "strong"]

#Example 2: a1 = ["tarp", "mice", "bull"]

a2 = ["lively", "alive", "harp", "sharp", "armstrong"]

returns []

Notes:
Arrays are written in "general" notation. See "Your Test Cases" for examples in your language.

In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas.

Beware: r must be without duplicates.
Don't mutate the inputs.*/

import java.util.*;
public class WhichAreIn { 
  
  public static String[] inArray(String[] array1, String[] array2) {
    //return new String[] { "arp" };
    ArrayList<String> result = new ArrayList<String>();
    String[] str = new String [array1.length];
    //loop through array1
    for(int i = 0; i < array1.length; i++)
    { 
      //loop through array2
      for(int j = 0; j < array2.length; j++)
      {
        if( array2[j].contains(array1[i]) )
        {
          //add to result 
          if(str[i] == array1[i])
            break;
          else
            str[i] = array1[i];
            result.add(array1[i]);
            System.out.println(array1[i]);    
        }
      }
    }
    //sort lexicographical
    //Arrays.sort(str);
    //System.out.println(Arrays.toString(str));
    Collections.sort(result);
    String[] str2 = new String [result.size()];
    // ArrayList to Array Conversion 
    for (int j = 0; j < result.size(); j++) { 
        // Assign each value to String array 
        str2[j] = result.get(j); 
        } 
    return str2;
  }
}