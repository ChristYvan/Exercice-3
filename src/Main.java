import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Le chemin peut être relatif à la racine de votre projet IntelliJ
        File fichier = new File("donnees.txt");
        int totalMots = 0;

        try (Scanner scanner = new Scanner(fichier)) {
            while (scanner.hasNext()) {
                scanner.next(); // Lit le mot suivant
                totalMots++;
            }
            System.out.println("Nombre total de mots dans le fichier : " + totalMots);
        } catch (FileNotFoundException e) {
            System.out.println("Erreur : Le fichier 'donnees.txt' est introuvable à la racine du projet.");
            System.out.println("Chemin attendu : " + fichier.getAbsolutePath());
        }
    }
}