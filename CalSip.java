import java.util.Scanner;

public class CalSip {
    public static int kalorientagesgenze;
    public static int nochFreieKalorien;

    public static void main(String[] args) {

        System.out.println("Hallo und Wilkommen bei CalSip!");
        Scanner scanner = new Scanner(System.in);
        String d = "D";
        String k = "k";
        String a = "a";
        boolean abruch = false;
        while (!abruch) {

            System.out.println("Was möchten sie tuhn?");
            System.out.println(1 + ". Wollen sie ihre Körperdaten aender?");
            System.out.println("Dann geben sie bitte D ein.");
            System.out.println();
            System.out.println(2 + ". Wollen sie eigebnen was sie gegessen haben, in Kalorien?");
            System.out.println("Dann geben sie bitte K ein.");

            System.out.println("Um das Programm zu beneden gebe sie bitte A ein.");
            System.out.println("Was wollen sie machen? Geben sie bitte die dem entsprechedne Taste ein:");
            String taste = scanner.next();

            if (taste.equalsIgnoreCase(d)) {
                // Ruft die Mehtode auf in der man die Körperdaten eingebenkann und die die
                // Kalorienanzahl berechent wie viele man essen darf un beies speichert.
            }
            if (taste.equalsIgnoreCase(k)) {
                // Ruft die Mehtode auf in der man die zusich genommenen Kalorien eintragen kann
                // und der noch freie Betrag zurückgegeben würd.
                nochFreieKalorien = kalorieneingabe();
                if (nochFreieKalorien <= 0) {
                    System.out.println("Achtung! Sie haben ihr heutige Kalorihenhöchstgenze erreicht.");
                } else {
                    System.out.println("Sie dürfen noch " + nochFreieKalorien
                            + "Kalorien zu sich nehmen. Befohr sie ihre heutige höstmenge erreichen.");
                }
            }
            if (taste.equalsIgnoreCase(a)) {
                abruch = true;
            }
        }
        System.out.print("CalSip wurde bendet. Wir wünschen noch einen schönnen und bleiben sie gesund.");

        scanner.close();
    }

    public static int kalorieneingabe() {
        Scanner scanner = new Scanner(System.in);
        int zusichgenommeneKalorien = Integer.parseInt(scanner.next());// "Integer.parseInt()" wandelt den String in ein
                                                                       // int um.
        int ergebnis = nochFreieKalorien - zusichgenommeneKalorien;
        scanner.close();
        return ergebnis;
    }

    public static double wasserbedarfProTag() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ihr Körpergewicht in Kilogramm ein: ");
        int körpergewichtInKilogramm = scanner.nextInt();
        scanner.close();

        /*
         * Konsoleneingabe: Scanner ist eine Möglichkeit in Java um einen Input eines
         * Users zu
         * bekommen. Hier wird ein Objekt "scanner" erschaffen und die nächste
         * eingegebene Ganzzahl
         * dem Körpergewicht zugeschrieben.
         */

        double wasserbedarfInLitern = körpergewichtInKilogramm * 0.0325; // 0.0325 Liter pro Kilogramm ist ein Richtwert
                                                                         // von der "Techniker Krankenkasse"
        // Berechnung erfolg mit Double, da mit Kommazahlen gearbeitet wird.

        System.out.println("Der Wasserbedarf pro Tag (in Litern) beträgt für sie: ");
        return wasserbedarfInLitern; // Rückgabewert des Wasserbedarfs in der Konsole mit vorherigem Statement zur
                                     // Zuordnung

    }
}
