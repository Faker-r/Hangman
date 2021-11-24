import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    private String word;
    private String guesses;
    private String current;
    
    public Puzzle(){
        word = "HELLO";
        guesses = "";
        current = "_____";
    }
    public boolean isUnsolved(){
        return !current.equals(word);
    }
    
    public boolean makeGuess(String guess){
        guess=guess.toUpperCase();
        guesses+=guess;
        boolean g = false;
        for(int i = 0; i<word.length(); i++){
            if(word.substring(i,i+1).equals(guess)) {
                current = current.substring(0,i)+guess+current.substring(i+1,word.length());
                g= true; 
            }
            
        }
        return g;
    }
    
    public String getWord(){
        return word;
    }
    public void show(){
        System.out.println("Puzzle: " + current);
        System.out.println();
        System.out.print("Guesses: " + guesses);
    }
}
