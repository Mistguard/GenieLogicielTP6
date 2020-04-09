public class Etat2 implements IEtat {
    @Override
    public void evenement1(Automate a) {

    }

    @Override
    public void evenement2(Automate a) {
        System.out.println("Je passe dans l'état 1");
        a.changementEtat(new Etat1());
        X x = a.getControlee();
        x.action2();
    }
}
