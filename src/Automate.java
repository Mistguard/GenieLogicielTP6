
public class Automate implements IEvenement {

    private Chrono2 controlee;

    private IEtat etatCourant;

    public void changementEtat(IEtat etat){
        etatCourant = etat;
    }

    public Chrono2 getControlee(){
        return controlee;
    }

    @Override
    public void demarrer() {
        etatCourant.demarrer(this);
    }

    @Override
    public void arreter() {
        etatCourant.arreter(this);
    }

    @Override
    public void suspendre() {
        etatCourant.suspendre(this);
    }

    @Override
    public void reprendre() {
        etatCourant.reprendre(this);
    }

    public Automate(Chrono2 chrono2){
        controlee = chrono2;
        etatCourant = new Etat1();
    }
}
