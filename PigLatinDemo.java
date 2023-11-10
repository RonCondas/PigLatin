/*Ronald Noriega

INEW-2338

11/10/2023

 IN THIS PROGRAM I 	WROTE  a a program that reads a sentence as input and converts each word to "Pig Latin*/

import javax.swing.JOptionPane;

public class PigLatinDemo {

    public static void main(String arg[]) {
        String sentence = JOptionPane.showInputDialog("Please enter your phrase or sentence!!!"); 

        String newPhrase = newStence(sentence); 

        display(newPhrase); 
    }

    public static String newStence(String sentence) //This method Creates a new sentence puting the character at index 0 at the end of the string
    {
        StringBuilder newSentence = new StringBuilder();

        String[] tokens = sentence.split(" ");

        for (String word : tokens) {
            char firstLetter = word.charAt(0);
            String restOfWord = word.substring(1);
            String newWord = restOfWord + firstLetter;

            newSentence.append(newWord).append(" "); 
        }

        return newSentence.toString().trim();
    }

    public static void display(String newPhrase)  // this method add AY at the end of each string 
    {
        String[] tokens = newPhrase.split(" ");

        StringBuilder result = new StringBuilder();
        for (String ese : tokens) {
            result.append(ese).append("AY").append(" ");
        }

        JOptionPane.showMessageDialog(null, result.toString().trim());
    }
}

