import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*; 
/**
 * Um eine Verbindung mit der Datenbank aufzunehmen ist diese Klasse notwendig.
 * http://www.ralphhenne.de/informatik/kaffeehandel/03DBZugriff.pdf
 * 
 * @Martin Specker
 * @18.2.2013
 */
public class JavaConnection extends MyWorld
{
    private final String treiber = "/Users/thomaswinter/Desktop/Leuchtkäfer Martin/Leuchtkäfer/mysql-connector-java-5.1.23/mysql-connector-java-5.1.23-bin.jar";
    private String dBase = "jdbc:mysql://localhost/uas";
    private String benutzer;
    private String passwort;
    private Connection con;
    private Statement stmt;
    private String dBaseH = "Leuchtkaefer";
    /** Konstruktor stellt die Daten zum Verbindungsaufbau  zusammen.*/
    public JavaConnection(String benutzerH, String passwortH)
    {
        //Stellt die Daten zusammen, um eine Verbindung aufzubauen.
        dBase = dBase + dBaseH;
        benutzer = benutzerH;
        passwort = passwortH;
    }
     
    public void act() 
    {
         
    }
     
    public void erstelleVerbindung()
        {
        try {
            //Laedt den Datenbanktreiber
            Class.forName(treiber);
            //Stellt die Verbindung her
            con = DriverManager.getConnection(dBase,  benutzer, passwort);
            //Erzeugt ein Objekt fuer Abfragen und Aenderungen der Datenbank
            stmt =  con.createStatement();
        }
        catch (ClassNotFoundException  cnfe) {
            System.out.println(cnfe.toString());
        }
        catch (SQLException sqle) {
            System.out.println(sqle.toString());
        }
    }
     
    public void schliesseVerbindung()
    {
        try {
            stmt.close();
            con.close();
        }
        catch (SQLException sqle) {
            System.out.println(sqle.toString());
        }
    }
}