import javax.sound.midi.Soundbank;

public class Etat3 implements IEtat {
    @Override
    public void demarrer(Automate a) {

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

    }

    @Override
    public void reprendre(Automate a) {
        System.out.println("Je reprends.");
        Chrono2 chrono2 = a.getControlee();
        chrono2.reprendreChrono();
        a.changementEtat(new Etat2());
    }
}
