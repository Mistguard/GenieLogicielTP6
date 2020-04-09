public class X implements IEvenement{

    private Automate controlleur;

    public Automate getControlleur() {
        return controlleur;
    }

    public void setControlleur(Automate controlleur) {
        this.controlleur = controlleur;
    }

    @Override
    public void evenement1() {
        controlleur.evenement1();
    }

    @Override
    public void evenement2() {
        controlleur.evenement2();
    }

    public void action1(){
        System.out.println("Je réalise l'action 1.");
    }

    public void action2(){
        System.out.println("Je réalise l'action 2.");
    }
}
