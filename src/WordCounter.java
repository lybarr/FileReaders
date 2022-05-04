///////////////////////////
////Day 2: Word Counter////
///////////////////////////

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class WordCounter {
    public static void main(String[] args) throws IOException{
        int numCharacters = 0;
        int numWords = 0;
        boolean readingFile = true;
        StringBuilder material = new StringBuilder();
        String material2 = "";

        String myFileName = "fixedFile.txt";

        try { // Count the characters in the file
            File myFile = new File (myFileName);
            FileReader reader = new FileReader (myFile);
            while (readingFile) {
                int readByte = reader.read();
                char readCharFromByte = (char) readByte;
                if(readByte == -1){
                    readingFile = false;
                } else {
                    //System.out.print(readCharFromByte);
                    material.append(readCharFromByte);
                    numCharacters ++;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try { // Count words in the File //Store file contents
            File myFile = new File (myFileName);
            FileReader words=new FileReader(myFile);
            char[] bytes=new char[(int)myFile.length()];
            words.read(bytes);
            String together=new String(bytes);
            String[] wordArray=together.split(" ");
            for(String word: wordArray){
                numWords++;
                //material2 += word + " ";
            }
            words.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        File myObj = new File("fixedFile.txt"); // Get file info - must create a new object for this to work in this case
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println( "\n" + material + "\n");
            System.out.println("File Writeable: " + myObj.canWrite());
            System.out.println("File Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
            System.out.println("Number of characters: " + numCharacters);
            System.out.println("Number of words: " + numWords);
        } else {
            System.out.println("The file does not exist.");
        }
    }
}