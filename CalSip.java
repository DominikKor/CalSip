import java.util.Scanner;
public class CalSip {
    public static void main(String[] args) {
        int kalorientagesgenze;
        int nochFreieKalorien;
        System.out.println("Hallo und Wilkommen bei CalSip!");
        Scanner scanner = new Scanner(System.in);
        String d = "D";
        String k = "k";
        String a = "a";
        boolean abruch = false;
        while (!abruch) {
        
            System.out.println("Was möchten sie tuhn?");
            System.out.println(1 +  ". Wollen sie ihre Körperdaten aender?");
            System.out.println("Dann geben sie bitte D ein.");
            System.out.println();
            System.out.println(2 + ". Wollen sie eigebnen was sie gegessen haben, in Kalorien?");
            System.out.println("Dann geben sie bitte K ein.");

            System.out.println("Um das Programm zu beneden gebe sie bitte A ein.");
            System.out.println("Was wollen sie machen? Geben sie bitte die dem entsprechedne Taste ein:");
            String taste = scanner.next();
        
        
        
            
        
            if (taste.equalsIgnoreCase(d)) {
                //Ruft die Mehtode auf in der man die Körperdaten eingebenkann und die die Kalorienanzahl berechent wie viele man essen darf un beies speichert.
            }
            if (taste.equalsIgnoreCase(k)) {
            //Ruft die Mehtode auf in der man die zusich genommenen Kalorien eintragen kann und der noch freie Betrag zurückgegeben würd.
                kaorieneingabe();
            }
            if (taste.equalsIgnoreCase(a)) {
                abruch = true;
            }
        }
        System.out.print("CalSip wurde bendet. Wir wünschen noch einen schönnen und bleiben sie gesund.");
    }
    public static void kaorieneingabe() {

    }
}
