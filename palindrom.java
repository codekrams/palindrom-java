
package methodenschreiben;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte gib ein Wort ein (bitte auf Groß- und Kleinschreibung achten): ");
        String wort = eingabe.next();
        
        String pruefung= isPalindrom(wort);
        
        System.out.println(pruefung);
    }
    
    
    public static String isPalindrom(String wort){
        char [] wortchar = wort.toCharArray();
        int i = 0;
        int j=wortchar.length-1;
        while (j>i) {
            if (wortchar[i]!=wortchar[j]){
                return (wort + " ist kein Palindrom");
            }
            else {
                i++;
                j--;
            }
        }
        return (wort + " ist ein Palindrom");
    }
    
}
