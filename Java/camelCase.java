/*Description:
Complete the method/function so that it converts dash/underscore delimited words into camel casing. 
The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"
"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

Solution:*/

import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    //convert String s into a char array
    char [] c = s.toCharArray();
    
    /*use for-loop to identify the letter after "-" 
    and capitalize that letter */
    StringBuilder sb = new StringBuilder();
    sb.append(c);
    
    for(int i = 0; i < sb.length(); i++){
      if( sb.charAt(i) == '-' || sb.charAt(i) == '_' )
        {  
          sb.deleteCharAt(i);         
          sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }
    }
    
    //convert back to string
    String newString = sb.toString();
    System.out.println("My string ======>>> " + newString);      
    //return string
    return newString;
  }
}