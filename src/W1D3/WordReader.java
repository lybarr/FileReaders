package W1D3;

public class WordReader {
    public static void main(String[] args){
        char[] word1 = new char[]{'d', 'o', 'g', 's'};
        char[] word2 = new char[]{'c', 'a', 't', 's'};
        char[] word3 = new char[]{'d', 'o', 'g'};
        char[] word4 = new char[]{'e', 'e', 'l'};
        Word dogWord = new Word(word1);
        Word catWord = new Word(word2);
        Word dogWord2 = new Word(word3);
        Word eelWord = new Word(word4);

        //Print a word
        System.out.print(dogWord.capitalized() + " are cool.");

        //Check if a word contains a certain character
        char c = 'g';
        if(dogWord.contains(c)){
            System.out.println("\nThe word " + dogWord + " contains '" + c + "'.");
        } else {
            System.out.println("\n" + dogWord + " does not contain " + c + ".");
        }

        //Give the index of a certain character in a word
        if(dogWord.indexOf(c) != -1){
            System.out.println("The index of '" + c + "' is: " + dogWord.indexOf(c));
        } else {
            System.out.println(c + " was not found.");
        }

        if(dogWord.equals(catWord)){
            System.out.println("It's equal.");
        } else {
            System.out.println("It's not equal.");
        }

        System.out.println("Results  of comparison: " + dogWord.compareTo(catWord));  //dogs is after cats - return 1
        System.out.println("Results  of comparison: " + dogWord.compareTo(dogWord));  //dogs is equal to dogs - return 0
        System.out.println("Results  of comparison: " + dogWord.compareTo(eelWord));  //dogs is before eel -  return -1
        System.out.println("Results  of comparison: " + dogWord.compareTo(dogWord2)); //dogs is after  dog - return 1

        System.out.println(dogWord.substring(2));
    }
}
