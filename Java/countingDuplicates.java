/*Description:
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice*/

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    // Write your code here
    int count = 0;
    int finalCount = 0;
    String s = text.toLowerCase();
    StringBuilder sb = new StringBuilder(s);
    int size = s.length();
    for(int i = 0; i < size; i++)
    {
      count = 0;
      for (int j = i + 1; j < size; j++) {
        if (sb.charAt(i) == sb.charAt(j)) {
          sb.deleteCharAt(j);
          j--;
          size--;
          if(count < 1)
          count++;
        }
      }
      finalCount = finalCount + count;
      if(count > 0)
      {
        sb.deleteCharAt(i);
        i--;
        size--;
      }
    }
    return finalCount;
  }
}