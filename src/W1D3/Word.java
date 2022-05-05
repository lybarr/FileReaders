package W1D3;

public class Word {
    private char[] charArray;
    private int length;


    public Word(char[] charArray){
        this.charArray = charArray;
        this.length = charArray.length;
    }

    public int getLength(){return length;}

    public String toString(){
        String stringRep = "";
        for(int i = 0; i < length; i++){
            stringRep = stringRep + charArray[i];
        }
        return stringRep;
    }

    public char charAt(int n) { return charArray[n]; }

    public boolean contains(char ch){
        for(int i = 0; i < charArray.length; i++){
            if(charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

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

    public char getCharAtIndex(int n){
        return charArray[n];
    }

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
