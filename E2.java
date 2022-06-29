import java.util.Scanner;
public class E2 {
    // E2
// Limiter le nombre de tentatives à 3.
// Au bout de 3 tentatives, afficher "Appareil verrouillé"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int codePin = 1234;
        int codePinASaisir = 0;
        for (int compteur = 1; compteur <= 3; compteur++) {
            System.out.print("Saisir le code PIN : ");
            codePinASaisir = input.nextInt();
            if (codePinASaisir == codePin) {
                System.out.println("Appareil déverouillé!!!!");
                break;
            }

            System.out.println("Code erroné, veuillez ressayer.");

            if (compteur == 3) {
                System.out.println("Vous avez dépassé vos 3 essais.");
            }
        }
        System.exit(0);
    }
}