package my_Utilitiess;

public class StringUtil {

    /*
       Reverse method

       it will accept the String parameter and return the reverse version of the String

      */

    public static String reverse(String original){

        String reverse= "";

        for (int i=original.length()-1; i>=0; i--){

            reverse +=original.charAt(i);

        }

        return reverse;
    }


    /*
    method will accept the Stirng and return a String in proper format
    first character as uppercase and the rest as lowercase

     */


    public static String getProperFormat(String words){

//        String firstChar= ""+words.toUpperCase().charAt(0);
//        String remainChar=words.substring(1).toLowerCase();
//         String propWords= firstChar+remainChar;

        // return propWords;
         return words.substring(0,1).toUpperCase()+ words.substring(1).toLowerCase();
    }

    public static int frequencyOfLetter(String word, char letter){
        int counter=0;
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i)==letter){
                counter++;

            }
        }

        return counter;
    }

    public static String getDuplicateCharacters(String str){

        String allDuplicate="";
        for (int i=0; i<str.length(); i++) {

            if (!allDuplicate.contains("" + str.charAt(i))) {


                int count = frequencyOfLetter(str, str.charAt(i));
                if (count > 1) {
                    allDuplicate += str.charAt(i);
                }
            }
        }
        return allDuplicate;

    }

    public static int indexOf(String[] arr, String element){
        for (int i=0; i< arr.length; i++){
            if (arr[i]== element){   // arr[i].equals(element)  two are same
                return i;
            }

        }
        return -1;
    }











































































}
