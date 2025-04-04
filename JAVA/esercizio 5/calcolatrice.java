import java.util.Scanner;

public class calcolatrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Inserisci il secondo numero: ");
        double n2 = scanner.nextDouble();
        
        System.out.println("Scegli un'operazione: (1-4)");
        System.out.println("1. Somma");
        System.out.println("2. Sottrazione");
        System.out.println("3. Moltiplicazione");
        System.out.println("4. Divisione");
       
        int operazione = scanner.nextInt();
        
        double risultato = 0; 
        
        switch (operazione) {
            case 1:
                risultato = n1 + n2;
                System.out.println("Risultato della somma: " + risultato);
                break;
            case 2:
                risultato = n1 - n2;
                System.out.println("Risultato della sottrazione: " + risultato);
                break;
            case 3:
                risultato = n1 * n2;
                System.out.println("Risultato della moltiplicazione: " + risultato);
                break;
            case 4:
                if (n2 != 0) {
                    risultato = n1 / n2;
                    System.out.println("Risultato della divisione: " + risultato);
                } else {
                    System.out.println("Errore: Divisione per zero!");
                }
                break;
            default:
                System.out.println("Operazione non valida!");
                break;
        } 

        scanner.close();
    }
}