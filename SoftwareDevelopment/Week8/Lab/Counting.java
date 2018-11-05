/*
Counting.java
Carmine Calicchio
20181022
*/

public class Counting{
    //Variables

    private int vowels;
    private int consonants;
    private int spaces;
    private String phrase;

    //Constructor
    public Counting(){
        vowels=0;
        consonants=0;
        spaces=0;
        phrase="";
    }

    //Setters
    public void setPhrase(String phrase){
        this.phrase=phrase.toUpperCase();
    }

    //Compute
    public void compute(){
        for(int i=0; i<phrase.length(); i++){
            if("AEIOU".indexOf(phrase.charAt(i))!=-1){
                vowels++;
            }
            if("BCDFGHJKLMNPQRSTVWXYZ".indexOf(phrase.charAt(i))!=-1){
                consonants++;
            }
            if(' '== phrase.charAt(i)){
                spaces++;
            }
        }
    }

    //Getters
    public int getVowels(){
        return vowels;
    }

    public int getConsonants(){
        return consonants;
    }

    public int getSpaces(){
        return spaces;
    }
}
