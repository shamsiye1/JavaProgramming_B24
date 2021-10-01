package day37_methods;

public class CountLetter {

    /*

    String , letter
    how many times is the letter in the String

    Example:
    apple. p
    ->2
    return type: int
    method name: frequencyOfLetter

   */
    public static int frequencyOfLetter(String word, char letter){
        int counter=0;
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i)==letter){
                counter++;

            }
        }

        return counter;
    }





}
