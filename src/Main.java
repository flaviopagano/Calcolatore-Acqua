import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo peso in chilogrammi: ");
        double peso = scanner.nextDouble();

        System.out.print("Inserisci il livello di attività fisica (1 = Sedentario, 2 = Moderatamente attivo, 3 = Molto attivo): ");
        int attivitaFisica = scanner.nextInt();

        double quantitaAcquaGiornaliera = calcolaQuantitaAcqua(peso, attivitaFisica);
        System.out.println("La quantità di acqua da bere al giorno è: " + quantitaAcquaGiornaliera + " litri");

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
        // Si consiglia di bere 30-35 ml di acqua per ogni chilogrammo di peso corporeo
        double rapportoAcquaPeso = 30;

        // Converti in litri
        return peso * rapportoAcquaPeso / 1000 * fattoreAttivita;
    }
}