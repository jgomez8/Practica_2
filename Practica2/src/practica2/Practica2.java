package practica2;

import static practica2.Metodes.*;

public class Practica2 {

    public static void main(String[] args) {

        do {

            menuOperacions();

            System.out.println("(" + numero1 + ") " + operacion + " (" + numero2 + ")" + " = " + res);
            System.out.println("\n Vols continuar operant? \n");
            System.out.println(" [s/n]");
            do {
                comprobar = true;
                operacion = sc.nextLine();

                switch (operacion) {
                    case "s":
                    case "S":
                    case "n":
                    case "N":
                        break;
                    default:
                        System.err.println("\n Error, posa un valor vàlid. \n");
                        comprobar = false;
                }
            } while (comprobar != true);

        } while (operacion.equalsIgnoreCase("s"));
    }
}
