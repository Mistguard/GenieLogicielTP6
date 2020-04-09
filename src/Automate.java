
public class Automate implements IEvenement {

    private X controlee;

    private IEtat etatCourant;

    public void changementEtat(IEtat etat){
        etatCourant = etat;
    }

    public X getControlee(){
        return controlee;
    }

    @Override
    public void evenement1() {
        etatCourant.evenement1(this);
    }

    @Override
    public void evenement2() {
        etatCourant.evenement2(this);
    }

    public Automate(X x){
        x.setControlleur(this);
        controlee = x;
        etatCourant = new Etat1();
    }
}
