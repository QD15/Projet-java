    public class Main {
    public static void main(String[] args) {
        Participant participant1 = new Participant("Alice", 25);
        Participant participant2 = new Participant("Bob", 30);

        Participant participant3 = new Participant("Charlie", 20, 10);
        

        System.out.println("Participant 1: " + participant1.getName() + ", Age: " + participant1.getAge() + ", Credits: " + participant1.getCredits());
        System.out.println("Participant 2: " + participant2.getName() + ", Age: " + participant2.getAge() + ", Credits: " + participant2.getCredits());
        System.out.println("Participant 3: " + participant3.getName() + ", Age: " + participant3.getAge() + ", Credits: " + participant3.getCredits());

        Organisation o1 = new Organisation("Paul", "Bar");
        Organisation o2 = new Organisation("Jean", "Accueil");
        System.out.println("Organisation 1: " + o1.getNom() + " " + o1.getPrenom());
        System.out.println("Organisation 2: " + o2.getNom() + " " + o2.getPrenom());
    }
    

}