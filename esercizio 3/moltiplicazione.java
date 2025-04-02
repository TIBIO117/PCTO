import java.util.Scanner;

public class moltiplicazione {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero: ");
        double n2 = scanner.nextDouble();
        
        double risultato = n1 * n2; 
        System.out.println("il risultato è: " + risultato);

        scanner.close();
    }
}
