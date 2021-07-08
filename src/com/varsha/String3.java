package com.varsha;
public class String3 {

/* countYZ
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
*/
public int countYZ(String str) {
    String r = "";
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (!Character.isLetter(c)) {
            r += "~";
        } else {
            r += Character.toString(c).toLowerCase();
        }
    }


    String[] words = r.split("~");

    int count = 0;
    String l;
    for (int i = 0; i < words.length; i++) {
        String w = words[i];
        if (w.length() > 1) {
            l = Character.toString(w.charAt(w.length() - 1));
        } else {
            l = w;
        }
    }

    return count;
}
            

/* withoutString
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
*/
public String withoutString(String base, String remove) {
          int rLen = remove.length();
        String result = "";
        for(int i = 0; i < base.length(); i++){
            if(i + rLen <= base.length() &&
                    base.substring(i, i+rLen).equalsIgnoreCase(remove)){
                i += rLen-1;
            }
            else
                result += base.charAt(i);
        }
        return result;
}

/* equalIsNot
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/
public boolean equalIsNot(String str) {
    int is = 0;
    int not = 0;
      
    for(int i = 0; i <= str.length() - 3; i++) {
        if(str.substring(i, i + 2).equals("is")) {
            is++;
        } else if(str.substring(i, i + 3).equals("not")) {
            not++;
        }
    }
                                    
    if(str.length() >= 2 && str.substring(str.length() - 2).equals("is"))
        is++;
                                              
    return is == not;
}

/* gHappy
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
*/
public boolean gHappy(String str) {


    boolean happyG = false;

    if (str.length() == 0) {
        return true;
    }

    if (str.length() < 2) {
        return false;
    }

    if (str.charAt(0) == 'g' && str.charAt(1) == 'g') {
        happyG = true;
    }

    for (int i = 1; i < str.length() - 1; i++) {
        if (str.charAt(i) == 'g' && str.charAt(i - 1) == 'g' && str.charAt(i + 1) == 'g') {
            happyG = true;
        }

        if (str.charAt(i) == 'g' && (str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g')) {
            happyG = true;
        } else if (str.charAt(i) != 'g') {
            continue;
        } else {
            happyG = false;
        }
    }

    if (str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g') {
        happyG = false;
    }

    return happyG;
}


/* countTriple
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
*/
public int countTriple(String str) {
          int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++;
            }
        }
        
        return count;
}

/* sumDigits
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
*/
public int sumDigits(String str) {
          int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(Character.toString(c));
            }
        }
        
        return sum;
}

/* sameEnds
Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
*/
public String sameEnds(String str) {
  if (str.length() == 0 || str.length() == 1) {
            return "";
        }
  String str1 = str.substring(0, str.length() / 2);
        String str2 = str.substring(str.length() / 2);
        int cu = 0, cd = 0;
        String r = "";
        
        for (int i = 0; i < str2.length(); i++) {
          if (cu == str1.length() || cd == str2.length()) {
                break;
            }
            char c = str1.charAt(cu);
            if (str1.charAt(cu) == str2.charAt(cd)) {
                cu++;
                cd++;
                r += Character.toString(c);
            } else {
                cd++;
            }
        }
        
        return r;
}

/* mirrorEnds
Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
*/
public String mirrorEnds(String string) {
  if (string.length() <= 1) return string;
  String r = "";
  int cu = 0, cd = string.length() - 1;
  for (int i = 0; i < string.length(); i++) {
    String u = Character.toString(string.charAt(cu));
    String d = Character.toString(string.charAt(cd));
    if (u.equals(d)) {
      r += u;
      cu++;
      cd--;
    } else {
      break;
    }
  }
  
  return r;
}

/* maxBlock
Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.

maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
*/
public int maxBlock(String str) {
        int[] maxes = new int[str.length()];
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) maxes[count]++;
            else count++;
        }
        int max = 0;
        for (int i = 0; i < maxes.length; i++) {
            maxes[i]++;
            if (maxes[i] > max) max = maxes[i];
        }
        return max;
}

/* sumNumbers
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
*/
public int sumNumbers(String str) {
        String s = "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                s += Character.toString(c);
            }
            else {
                if (s.length() > 0) {
                    sum += Integer.parseInt(s);
                    s = "";
                }
            }
        }
        if (s.length() > 0) sum += Integer.parseInt(s);
        return sum;
  
}

/* notReplace
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
*/
public String notReplace(String str) {
  String result = "";
  int len = str.length();
  
  for(int i = 0; i < len; i++){
    if(i-1 >= 0 && Character.isLetter(str.charAt(i - 1)) || i < len - 2 && Character.isLetter(str.charAt(i + 2))) {
      result += str.charAt(i);
    } else if (i < len - 1 && str.substring(i, i + 2).equals("is")) {
      result += "is not";
      i++;
    }
    else result += str.charAt(i);
  }
  return result;
}

}