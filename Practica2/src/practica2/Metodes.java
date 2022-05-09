package practica2;

import java.util.Scanner;

public class Metodes {

    static Scanner sc = new Scanner(System.in);
    static double numero1;
    static double numero2;
    static double res = 0;
    static String operacion = "";
    static boolean comprobar = false;

    public static void menuOperacions() {
        String numero1;
        do {
            System.out.print("Introdueix el primer numero amb el que vols operar: ");
            numero1 = sc.nextLine();
        } while (!numero1.matches("[+-]?[\\d]*[.]?[\\d]+"));
        Metodes.numero1 = Double.parseDouble(numero1);
        double n1 = new Double(numero1);

        do {
            System.out.println("\nSelecciona l'operació desitjada:"
                    + "\n + => Sumar"
                    + "\n - => Restar"
                    + "\n x => Multiplicar"
                    + "\n / => Dividir"
                    + "\n * => Potencia"
                    + "\n % => Residu");
            System.out.print("> ");
            operacion = sc.nextLine();
            if (operacion.equals("+") || operacion.equals("-") || operacion.equals("x")
                    || operacion.equals("X") || operacion.equals("/") || operacion.equals("%")
                    || operacion.equals("*")) {
                comprobar = true;
            } else {
                comprobar = false;
            }
        } while (comprobar != true);

        String numero2;
        do {
            System.out.print("\nIntrodueix el primer numero amb el que vols operar: ");
            numero2 = sc.nextLine();
        } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
        Metodes.numero2 = Double.parseDouble(numero2);
        double n2 = new Double(numero2);

        do {
            comprobar = true;
            switch (operacion) {
                case "+":
                    res = n1 + n2;
                    break;
                case "-":
                    res = n1 - n2;
                    break;
                case "x":
                    res = n1 * n2;
                    break;
                case "/":
                    while (n2 == 0) {
                        do {
                            System.err.println(" Al denominador hi ha un zero \n"
                                    + "per a  evitar errors coloca un altre valor.");
                            numero2 = sc.nextLine();
                        } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                        Metodes.numero2 = Double.parseDouble(numero2);
                        n2 = new Double(numero2);
                    }
                    res = n1 / n2;
                    break;
                case "*":
                    res = Math.pow(n1, n2);
                    break;
                case "%":
                    while (n2 == 0) {
                        do {
                            System.err.println(" Al denominador hi ha un zero \n"
                                    + "per a  evitar errors coloca un altre valor.");
                            numero2 = sc.nextLine();
                        } while (!numero2.matches("[+-]?[\\d]*[.]?[\\d]+"));
                        Metodes.numero2 = Double.parseDouble(numero2);
                        n2 = new Double(numero2);
                    }
                    res = n1 % n2;
                    break;
            }
        } while (comprobar != true);
    }
    
    
    public static void sortida() {
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
    }
}
