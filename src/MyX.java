import java.util.Scanner;

public class MyX {
    public static void main(String[] args) {

        X x = new X();
        Automate automate = new Automate(x);

        Scanner read = new Scanner(System.in);
        String ans;

        while(true){
            System.out.println("Choisir un évènement : \n" +
                    "1 -> évènement 1\n" +
                    "2 -> évènement 2\n" +
                    "0 -> quitter"
            );

            ans = read.nextLine();

            while(!ans.matches("[0-2]")) {
                System.out.println("Saisie invalide");
                ans = read.nextLine();
            }

            switch (ans){
                case "1" :
                    x.evenement1();
                    break;
                case "2" :
                    x.evenement2();
                    break;
                case "0" :

                    break;
            }

            if(ans.matches("0")){
                System.out.println("bye!");
                break;
            }
        }
    }
}
