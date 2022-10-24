package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
 
        
        String asciiArt = FigletFont.convertOneLine("App");
        System.out.println(asciiArt);
        
        
        String titre = ResourceBundle.getBundle("application").getString("titre"); 
        String asciiArt1 = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt1);
        
        String environnement = ResourceBundle.getBundle("application").getString(
        		"environnement");
        		  System.out.println("Environnement : " + environnement);
    }
}
