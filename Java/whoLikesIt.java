/*Description:
You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.

Implement a function likes :: [String] -> String, which must take in input array, containing the names of people who like an item. It must return the display text as shown in the examples:

likes [] -- must be "no one likes this"
likes ["Peter"] -- must be "Peter likes this"
likes ["Jacob", "Alex"] -- must be "Jacob and Alex like this"
likes ["Max", "John", "Mark"] -- must be "Max, John and Mark like this"
likes ["Alex", "Jacob", "Mark", "Max"] -- must be "Alex, Jacob and 2 others like this"*/

class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
      int count = 0;
      String msg = "";
      
      for(int i = 0; i < names.length; i++)
      {  
          if(names.length == 1)
          { msg = names[i] + " likes this";
          System.out.println(msg);}  
          else if(names.length == 2)
            {msg = names[i] + " and " + names[++i] + " like this";
            System.out.println(msg);}
          else if(names.length == 3)
            {msg = names[i] + ", " + names[++i] + " and " + names[++i] + " like this";
            System.out.println(msg);}
          else if(names.length > 3)
            {msg = names[i] + ", " + names[++i] + " and " + Integer.toString(names.length-2) + " others like this";
            System.out.println(msg);}
        break;
      }
      if(msg == ""){msg = "no one likes this";}
      
      return msg;
    }
}