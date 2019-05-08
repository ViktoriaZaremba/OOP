package ua.lpnuai.oop.zaremba01;

import ua.lpnuai.oop.zaremba01.menu;

import java.util.Scanner;

public class sentence {
    public static void main(String[] args){
        boolean debugMode = false;
        for(String arg: args){
            if(arg.equals("-h") || arg.equals("-help")){
                System.out.println("\nAvtor: \nZaremba Viktoria, KN-110, IKNI \n\n" +
                        "Pryznachennya prohramy: \nVvesty tekst. U teksti slova zadanoyi dovzhyny zaminyty zaznachenym\n" +
                        "ryadkom. Vyvesty pochatkovyy tekst ta rezulʹtat\n\n" +
                        "Menu:\n" +
                        "1 - vvedenya danyh" +
                        "\n2 - perehlyad danyh" +
                        "\n3 - vykonannya odchyslen" +
                        "\n4 - vidobrajennya rezultaty" +
                        "\n5 - zavershennya prohramy\n" +
                        "\nParametry komandnoho ryadka:\n" +
                        "-h abo -help:\t vsya informacia pro prohramy\n" +
                        "-d abo -debag:\t v protsesi roboty prohramy\n" +
                        "vidobrazhayutʹsya dodatkovi dani, shcho polehshuyutʹ nalahodzhennya ta\n" +
                        "perevirku pratsezdatnosti prohramy");
                return;
            }
            if(arg.equals("-d") || arg.equals("-debug")){
                debugMode = true;
                System.out.println("\n-Debug Mode-");
            }
        }

        menu men = new menu();
        men.printMenu();
        int choice = men.makeChoice();


        String rechenya = null;
        int dowslova = 0;
        String ryadok = null;
        StringBuffer doZminy = null;

        if (choice == 1){
            Scanner vvid = new Scanner(System.in);
            Scanner vvid1 = new Scanner(System.in);
            Scanner vvid2 = new Scanner(System.in);

            if (debugMode){
                System.out.println("-Debug-\n" +
                        "rechenya = " + rechenya +
                        "\ndowslova = " + dowslova +
                        "\nryadok = " + ryadok +"\n");
            }

            System.out.println("Vvedit dani");
            rechenya = vvid.nextLine();
            dowslova = vvid1.nextInt();
            ryadok = vvid2.nextLine();

            men.printMenu();
            choice = men.makeChoice();
        }

        if (choice == 2){
            if (debugMode){
                System.out.println("-Debag-\n" +
                        "rechenya = " + rechenya +
                        "\ndowslova = " + dowslova +
                        "\nryadok = " + ryadok +"\n");
            }
            if (rechenya==null){
                System.out.println("Nema danyh");

            }
            else {
                System.out.println("Dani: " +
                        "\nText: " + rechenya +
                        "\nZadana dovjyna: " + dowslova +
                        "\nRyadok dlya zaminy: " + ryadok + "\n");
            }

            men.printMenu();
            choice = men.makeChoice();
        }

        if (choice == 3) {
            if (debugMode){
                System.out.println("-Debug mode-\n" +
                        "rechenya = " + rechenya +
                        "\ndowslova = " + dowslova +
                        "\nryadok = " + ryadok);
            }

            doZminy = new StringBuffer(rechenya);

            doZminy.append(" ");
            int space = 0;
            for (int i = 0; i<doZminy.length(); i++){
                if (doZminy.charAt(i) == ' '){
                    if (i - space == dowslova){
                        doZminy.replace(space, i, ryadok);
                        space += ryadok.length()+1;
                        if (debugMode){
                            System.out.println("space = " + space +"\ndoZminy = " + doZminy);
                        }
                        continue;
                    }
                space = i+1;
                }
            }
            doZminy.toString();

            System.out.println("\nProcessing...\n");
            men.printMenu();
            choice = men.makeChoice();

        }


        if (choice == 4) {
            if (debugMode){
                System.out.println("Debag mode:\n" +
                        "rechenya = " + rechenya +
                        "\ndowslova = " + dowslova +
                        "\nryadok = " + ryadok + "\ndoZminy = " + doZminy+"\n");
            }
            System.out.println(rechenya);
            System.out.println(doZminy);
            men.printMenu();
            choice = men.makeChoice();
        }

        if (choice == 5) {
            if (debugMode){
                System.out.println("-Debug-\n" +
                        "rechenya = " + rechenya +
                        "\ndowslova = " + dowslova +
                        "\nryadok = " + ryadok + "\ndoZminy = " + doZminy +"\n");
            }
            System.out.println("Bye!");
        }

    }

}
