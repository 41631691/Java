
package ejercicioOcho;

import java.util.Locale;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Cadena cadena =new Cadena();
        
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String frase;
        
        System.out.println("ngrese una frase que puede ser una palabra o varias palabras separadas por un espacio en blanco");
        frase =scan.next();
        cadena.setFrase(frase);
        cadena.setLongitud(cadena.getFrase().length());
    }
    
}
