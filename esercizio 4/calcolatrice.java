import java.util.Scanner;

public class calcolatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero: ");
        double n2 = scanner.nextDouble();
        
        double risultatoM = n1 * n2; 
        double risultatoP = n1 + n2;
        double risultatoS = n1 - n2;
        double risultatoD = n1 / n2; 
        System.out.println("il risultato è: " + risultatoP);
        System.out.println("il risultato è: " + risultatoS);
        System.out.println("il risultato è: " + risultatoM);
        System.out.println("il risultato è: " + risultatoD);
        scanner.close();
    }
}