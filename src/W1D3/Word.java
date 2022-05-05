package W1D3;

public class Word {
    private char[] charArray;
    private int length = 1;

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

    public boolean equals(char[] charArr){
        if(length == charArr.length){
            int i= 0;
            while (charArray[i] == charArr[i])
            for(i= 0; i < length; i++){
                if (i == length - 1){
                    return true;
                }
            }
        }
        return false;
    }
}
