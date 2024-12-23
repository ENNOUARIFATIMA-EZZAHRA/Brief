import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant extends Personne {
    private static ArrayList<Apprenant> LIST = new ArrayList<>();

    // Constructor
    public Apprenant(int id, String nom, String prenom, String email) {
        super(id, nom, prenom, email);
    }

    public Apprenant() {}
// Gestion des apprenants
    public void gestionApprenants() {
        Scanner sc = new Scanner(System.in);
        int choix;
    

        while (true) {
            System.out.println("\n==== Menu des Apprenants ====\n");
            System.out.println("1. Ajouter un apprenant");
            System.out.println("2. Associer un apprenant a une classe");
            System.out.println("3. Modifier les informations d'un apprenant");
            System.out.println("4. Supprimer un apprenant");
            System.out.println("5. Afficher les apprenants");
            System.out.println("0. Retour au menu principal");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            if (choix == 0) {
                System.out.println("Retour au menu principal...");
                break;
            }

            switch (choix) {
                case 1:
                    ajouterApprenant(sc);
                    break;
                case 2:
                    System.out.println("Associer un apprenant a une classe (non implementee)");
                    break;
                case 3:
                    modifierApprenant(sc);
                    break;
                case 4:
                    supprimerApprenant(sc);
                    break;
                case 5:
                    afficherApprenants();
                    break;
                default:
                    System.out.println("Choix invalide, veuillez reessayer.");
            }
        }
        sc.close();
    }

    public void ajouterApprenant(Scanner sc) {
        System.out.println("Entrer id de l'apprenant:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Entrer nom de l'apprenant:");
        String nom = sc.nextLine();
        System.out.println("Entrer prenom de l'apprenant:");
        String prenom = sc.nextLine();
        System.out.println("Entrer email de l'apprenant:");
        String email = sc.nextLine();
        LIST.add(new Apprenant(id, nom, prenom, email));
        System.out.println("L'apprenant a ete ajouter avec succes !");
    }

    public void afficherApprenants() {
        if (LIST.isEmpty()) {
            System.out.println("Aucun apprenant a afficher !");
        } else {
            System.out.println("La liste des apprenants :");
            for (Apprenant apprenant : LIST) {
                System.out.println(apprenant);
            }
        }
    }
public void modifierApprenant(Scanner sc) {
        System.out.println("Entrer l'id de l'apprenant a modifier:");
        int id = sc.nextInt();
        sc.nextLine();
        Apprenant apprenant = null;
        for (Apprenant ap : LIST) {
            if (ap.getId() == id) {
                apprenant = ap;
                break;
            }
        }
        if (apprenant != null) {
            System.out.println("Entrer nouveau nom:");
            String nouveauNom = sc.nextLine();
            apprenant.setNom(nouveauNom);

            System.out.println("Entrer nouveau prenom:");
            String nouveauPrenom = sc.nextLine();
            apprenant.setPrenom(nouveauPrenom);

            System.out.println("Entrer nouveau email:");
            String nouveauEmail = sc.nextLine();
            apprenant.setEmail(nouveauEmail);
            System.out.println("Les informations ont ete modifi�es avec succes !");
        } else {
            System.out.println("Aucun apprenant trouve avec cet id !");
        }
    }

    public void supprimerApprenant(Scanner sc) {
        System.out.println("Entrer l'id de l'apprenant a supprimer:");
        int id = sc.nextInt();
        sc.nextLine();
        Apprenant apprenant = null;
        for (Apprenant ap : LIST) {
            if (ap.getId() == id) {
                apprenant = ap;
                break;
            }
        }
        if (apprenant != null) {
            LIST.remove(apprenant);
            System.out.println("Apprenant supprime avec succes !");
        } else {
            System.out.println("Aucun apprenant trouve avec cet id !");
        }
    }
}