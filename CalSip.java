import java.util.Scanner;

public class CalSip {
    public static void main(String[] args) {
        System.out.println("Hallo und Wilkommen bei CalSip!");
    }

    public static int wasserbedarfProTag(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ihr Körpergewicht in Kilogramm ein: ");
        int körpergewichtInKilogramm = scanner.nextInt();
        scanner.close();

        /* Konsoleneingabe: Scanner ist eine Möglichkeit in Java um einen Input eines Users zu 
        bekommen. Hier wird ein Objekt "scanner" erschaffen und die nächste eingegebene Ganzzahl
        dem Körpergewicht zugeschrieben.
        */

        double wasserbedarfInLitern = körpergewichtInKilogramm * 0.0325; // 0.0325 Liter pro Kilogramm ist ein Richtwert von der "Techniker Krankenkasse"
        //Berechnung erfolg mit Double, da mit Kommazahlen gearbeitet wird.

        return 0;
        
    }
}
