import java.util.Scanner;

public class Vowels {
    /*
    Return the number (count) of vowels in the given string.
    We will consider a, e, i, o, and u as vowels for this Kata.
    The input string will only consist of lower case letters and/or spaces.
    */
    public static int getCount(String str) {
      // Variables
        int vowelsCount = 0;
      char[] charArr = str.toCharArray();

      // loop through char array and count vowels
      for (int i = 0; i < charArr.length; i++) {

        // if a vowel is found increment vowelCount
          switch (charArr[i]) {
              case 'a':
              vowelsCount++;
              break;

              case 'e':
              vowelsCount++;
              break;

              case 'i':
              vowelsCount++;
              break;

              case 'o':
              vowelsCount++;
              break;

              case 'u':
              vowelsCount++;
              break;
          }// end switch case

      }// end for

      return vowelsCount;
    }// end getCount

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string and I will tell you how many vowels it has: ");
    String str = in.nextLine();

    System.out.println("There are " + getCount(str) + " vowels.");
    }// end main
  
  }// end class
