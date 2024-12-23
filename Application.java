



import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    private ArrayList<Apprenant> Apprenant = new ArrayList<>();

    public static void main(String[] args) {

        new Application().start();
    }


    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Menu principale ====\n");
            System.out.println("1. Gestion des Apprenants\n");
            System.out.println("2. Gestion des Formateurs\n");
            System.out.println("3. Gestion des Classes\n");
            System.out.println("0. Quitter\n");
            System.out.println("Votre choix : ");
            int choix = sc.nextInt();

        
            

            switch (choix) {
                case 1:

                    new Apprenant().gestionApprenants();
                    break;
                case 2:
                    System.out.println("Gestion des formateurs (non implementee)");
                    break;
                case 3:
                    System.out.println("Gestion des Classes (non implementee)");
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        
    }
}

        
       
    


    
