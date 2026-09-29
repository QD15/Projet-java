public abstract class Personne {
    private String nom;
    private String prenom;
    private int age;
    private int credits;

    public Personne(String nom, String prenom, int age, int credits) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.credits = credits;
        if (credits < 5) {
            System.out.println("Vous n'avez pas assez de crédits pour faire une partie  de lancer de claquette.");
        }
    }
    

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

}