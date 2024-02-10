import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            // Inserisci il peso
            System.out.print("Inserisci il tuo peso in chilogrammi: ");
            double peso = scanner.nextDouble();

            // Inserisci un numero da 1 a 3 che indica il livello di attività fisica
            System.out.print("Inserisci il livello di attività fisica (1 = Sedentario, 2 = Moderatamente attivo, 3 = Molto attivo): ");
            int attivitaFisica = scanner.nextInt();

            double quantitaAcquaGiornaliera = calcolaQuantitaAcqua(peso, attivitaFisica);
            System.out.println("La quantità di acqua da bere al giorno è: " + quantitaAcquaGiornaliera + " litri");

        } catch (InputMismatchException e) {
            System.out.println("Inserisci un valore numerico valido");

        }
         scanner.close();
    }


    // Funzione per calcolare la quantità di acqua da bere al giorno
    private static double calcolaQuantitaAcqua(double peso, int attivitaFisica) {
        double fattoreAttivita = 0;

        switch (attivitaFisica) {
            case 1:
                fattoreAttivita = 1.2; // Sedentario
                break;
            case 2:
                fattoreAttivita = 1.5; // Moderatamente attivo
                break;
            case 3:
                fattoreAttivita = 2.0; // Molto attivo
                break;
        }

        // 30-35 ml di acqua per ogni chilogrammo di peso corporeo
        double rapportoAcquaPeso = 30;


        // Converti da ML a Litri
        return peso * rapportoAcquaPeso / 1000 * fattoreAttivita;
    }


}