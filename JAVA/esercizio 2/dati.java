import java.util.Scanner;

public class dati {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome: ");
        String string1 = scanner.nextLine();

        System.out.println("Inserisci il cognome: ");
        String string2 = scanner.nextLine();

        System.out.println("Buongiorno sig.ra/sig. " + string1+ " " + string2);

        scanner.close()
    }
}
