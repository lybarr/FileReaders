//////////////////////////////////
///   Day 2: Case Changer      ///
///   By Lysette Barrera       ///
//////////////////////////////////


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CaseChanger {
    public static void main(String[] args) {

        System.out.println("\n--------------------------------------\n" + 
            "This program will change all characters in a file from uppercase to lowercase, and vice-versa. Then it will write the contents to a new file.\n");

        try{ //Create a file
            File myFile = new File("convertedFile.txt");
            if(myFile.createNewFile()){
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println(myFile.getName() + " was found.");
            }
        } catch (IOException e){
            System.out.println("An error occurred. (create a file)");
            e.printStackTrace();
        } //catch

        try{//Read/Write to a file
            File myFixedFile = new File("fixedFile.txt");
            FileReader myReader = new FileReader(myFixedFile);

            char[] charArray = new char[1000];
            int numCharacters = 0;
            boolean readingFile = true;

            File myConvertedFile = new File("convertedFile.txt");
            FileWriter myFileWriter = new FileWriter(myConvertedFile);


            System.out.println("Converting contents of " + myFixedFile.getName() + "...");

            while(readingFile){
                int readByte = myReader.read();
                char readChar = (char) readByte;

                if(readByte == -1){
                    readingFile = false;
                } else {
                    if (Character.isUpperCase(readChar)){
                        readChar = Character.toLowerCase(readChar);
                        charArray[numCharacters] = readChar;
                        numCharacters++;
                    } else if (Character.isLowerCase(readChar)){
                        readChar = Character.toUpperCase(readChar);
                        charArray[numCharacters] = readChar;
                        numCharacters++;
                    } 
                    else {
                        charArray[numCharacters] = readChar;
                        numCharacters++;
                    }
                }
            }

            System.out.println("Writing to " + myConvertedFile.getName() + "...");

            for(int i = 0; i < numCharacters; i++){
                myFileWriter.append(charArray[i]);
            }

            myReader.close();
            myFileWriter.close();

            System.out.println("Success.");
        } catch (IOException e){
            System.out.println("An error occurred. (Read/Write a file)");
            e.printStackTrace();
        }

    }
}
