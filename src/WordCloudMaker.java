import java.util.Scanner;


public class WordCloudMaker {
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    
    String word;
    int maximumFrequency = 0;
    int minimumFrequency = Integer.MAX_VALUE;

    for(WordCount wordCount : wordCountList) {
      if(wordCount.count > maximumFrequency) {
        maximumFrequency = wordCount.count;
        }
      if(wordCount.count < minimumFrequency) {
        minimumFrequency = wordCount.count;
      }
    }

    System.out.print( "Enter a word: " );
    keyboard.nextLine();
    /*If the specified word is already in this array, then its count increased by one*/
   /* Otherwise, the word is added to this map with a count of 1 */

     /* Returns a list objects, one per word stored in the array, sorted alphabetically */
    /*  Sorted in decreasing order by count*/

      /*Return a list of objects, one per stored and sorted*/
  }
}
