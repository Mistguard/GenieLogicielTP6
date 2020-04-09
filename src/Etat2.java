public class Etat2 implements IEtat {
    @Override
    public void demarrer(Automate a) {
        Chrono2 chrono2 = a.getControlee();
        chrono2.lancerChrono();
    }

    @Override
    public void arreter(Automate a) {
        System.out.println("Je m'arrête.");
        Chrono2 chrono2 = a.getControlee();
        chrono2.stopperChrono();
        a.changementEtat(new Etat1());
    }

    @Override
    public void suspendre(Automate a) {
        System.out.println("Je me suspends.");
        Chrono2 chrono2 = a.getControlee();
        chrono2.suspendreChrono();
        a.changementEtat(new Etat3());
    }

    @Override
    public void reprendre(Automate a) {

    }
}
