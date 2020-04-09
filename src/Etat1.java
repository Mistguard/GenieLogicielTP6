public class Etat1 implements IEtat {
    @Override
    public void demarrer(Automate a) {
        System.out.println("Je démarre.");
        Chrono2 chrono2 = a.getControlee();
        chrono2.lancerChrono();
        a.changementEtat(new Etat2());
    }

    @Override
    public void arreter(Automate a) {

    }

    @Override
    public void suspendre(Automate a) {

    }

    @Override
    public void reprendre(Automate a) {

    }
}
