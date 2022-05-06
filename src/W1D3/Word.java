package W1D3;

public class Word {
    private char[] charArray;
    private int length;


    public Word(char[] charArray){
        this.charArray = charArray;
        this.length = charArray.length;
    }

    // Set charArray
    public void setCharArray(char[] charArray){
        this.charArray = charArray;
        length = charArray.length;
    }

    //  Get length
    public int getLength(){return length;}

    // Convert charArray to String,  return String
    public String toString(){
        String stringRep = "";
        for(int i = 0; i < length; i++){
            stringRep = stringRep + charArray[i];
        }
        return stringRep;
    }

    // Get char at a certain index
    public char charAt(int n) { return charArray[n]; }

    // Returns true if given char is found in charArray
    public boolean contains(char ch){
        for(int i = 0; i < charArray.length; i++){
            if(charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

    // Returns the index of given char in charArray
    public int indexOf(char c){
        if(contains(c)){
            for(int i = 0; i < charArray.length; i++){
                if(charArray[i] == c){
                    return i;
                }
            }
        }
        return -1;
    }

    // Returns the char in charArray at given index n
    public char getCharAtIndex(int n){
        return charArray[n];
    }

    // Converts charArray to String and returns capitalized String
    public String capitalized(){
        String stringRep = "";
        for(int i = 0; i < length; i++){
            if(i == 0){
                stringRep = stringRep + Character.toUpperCase(charArray[i]);
            } else {
                stringRep = stringRep + charArray[i];
            }
        }
        return stringRep;
    }

    // Checks if given word is equal to charArray
    public boolean equals(Word toCheck){
        if(length == toCheck.getLength()){
            int i= 0;
            while (charArray[i] == toCheck.getCharAtIndex(i)){
                for(i= 0; i < length; i++){
                    if (i == length - 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public char[] substring(int a){
        char [] charArr = new char[a];
        for(int i = 0; i < a;i++){
            charArr[i] =  charArray[i];
        }
        return charArr;
    }

    public int compareTo(Word toCheck){
        //return 1 if word is lexicographically after given word
        //return -1 if word is before
        //return 0 if equal

        if( length > toCheck.getLength() ){
            int i= 0;
            while(charArray[i] > toCheck.getCharAtIndex(i) || charArray[i] == toCheck.getCharAtIndex(i)){
                for(i= 0; i < toCheck.getLength(); i++){
                    if(charArray[i] > toCheck.getCharAtIndex(i)){
                        return 1;
                    }
                }
                return 1;
            }
            return -1;
        }

        if( length < toCheck.getLength() ){
            int i= 0;
            while(charArray[i] > toCheck.getCharAtIndex(i) || charArray[i] == toCheck.getCharAtIndex(i)){
                for(i= 0; i < length; i++){
                    if(charArray[i] > toCheck.getCharAtIndex(i)){
                        return 1;
                    }
                }
                return 1;
            }
            return -1;
        }

        if (equals(toCheck)){
            return 0;
        }
        int i = 0;
        while(charArray[i] > toCheck.getCharAtIndex(i) || charArray[i] == toCheck.getCharAtIndex(i)){
            for(i= 0; i < length; i++){
                if(charArray[i] > toCheck.getCharAtIndex(i)){
                    return 1;
                }
            }
            return 1;
        }
        return -1;
    }
}
