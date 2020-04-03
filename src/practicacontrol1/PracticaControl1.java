package practicacontrol1;

import java.io.IOException;
import java.util.Scanner;

public class PracticaControl1 {

    /**
     * @param args the command line arguments
     */
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        keyboard.useDelimiter("\n");
        int option = -1;
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio switch
                case 1:
                    p1();
                    break;
                case 2:
                    p2();
                    break;
                case 3:
                    p3();
                    break;
                case 4:
                    p4();
                    break;
                case 5:
                    p5();
                    break;
                case 6:
                    p6();
                    break;
                case 7:
                    p7();
                    break;
                case 8:
                    p8();
                    break;
                case 9:
                    p9();
                    break;
                case 10:
                    p10();
                    break;
                case 11:
                    p11();
                    break;
                case 12:
                    p12();
                    break;
                case 13:
                    p13();
                    break;
                case 14:
                    p14();
                    break;
                case 15:
                    p15();
                    break;
                case 16:
                    p16();
                    break;
                case 17:
                    p17();
                    break;
                case 18:
                    p18();
                    break;
                case 19:
                    p19();
                    break;
                case 20:
                    p20();
                    break;
                case 21:
                    p21();
                    break;
                case 22:
                    p22();
                    break;
                case 23:
                    p23();
                    break;
                case 24:
                    p24();
                    break;
                case 25:
                    p25();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }//fin switch
        } while (option != 10);
    }

    private static void p0() {
        System.out.println("");
        System.out.println("gracias ......     adeu");
    }

    private static void p1() {
        System.out.print("Hours?: ");
        int hours = keyboard.nextInt();
        System.out.print("Min?: ");
        int min = keyboard.nextInt();
        System.out.print("Seconds? ");
        int Sec = keyboard.nextInt();
        System.out.println("");
        int hSec = hours * 3600;
        int mSec = min * 60;
        int totalSec = hSec + mSec + Sec;
        System.out.println("Total seconds = " + totalSec);
        System.out.println("");
    }

    private static void p2() {
        double pi = 3.1416;
        System.out.println("Radius?: ");
        float radius = keyboard.nextFloat();
        float per = (float) (2 * pi * radius);
        float area = (float) (pi * Math.pow(radius, 2));
        System.out.println("Perimeter = " + per);
        System.out.println("Area = " + area);
    }

    private static void p3() {
        System.out.println("Number one?: ");
        int n1 = keyboard.nextInt();
        System.out.println("Number two?: ");
        int n2 = keyboard.nextInt();
        System.out.println("Number three?: ");
        int n3 = keyboard.nextInt();
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println("The number " + n1 + " is the smallest and the number " + n3 + " is the biggest");
        } else if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println("The number " + n1 + " is the smallest and the number " + n2 + " is the biggest");
        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println("The number " + n2 + " is the smallest and the number " + n3 + " is the biggest");
        } else if (n2 > n1 && n2 > n3 && n3 > n1) {
            System.out.println("The number " + n2 + " is the smallest and the number " + n1 + " is the biggest");
        } else if (n3 > n1 && n3 > n2 && n1 > n2) {
            System.out.println("The number " + n3 + " is the smallest and the number " + n2 + " is the biggest");
        } else if (n3 > n1 && n3 > n2 && n2 > n1) {
            System.out.println("The number " + n1 + " is the smallest and the number " + n3 + " is the biggest");
        }
    }

    private static void p4() {
        System.out.print("Side1?: ");
        int s1 = keyboard.nextInt();
        System.out.print("Side2?: ");
        int s2 = keyboard.nextInt();

        int per = (s1 * 2) + (s2 + 2);
        int area = s1 * s2;
        System.out.println("The perimeter is: " + per);
        System.out.println("The area is: " + area);
    }

    private static void p5() {
        System.out.println("Time of the day?: m/t/n");
        String day = keyboard.next();
        System.out.println("Gender?: m/f");
        String sex = keyboard.next();

        if ("m".equals(sex) && "m".equals(day)) {
            System.out.println("good day, sir.");
        } else if ("m".equals(sex) && "t".equals(day)) {
            System.out.println("good afternoon, sir.");
        } else if ("m".equals(sex) && "m".equals(day)) {
            System.out.println("good night, sir.");
        } else if ("f".equals(sex) && "m".equals(day)) {
            System.out.println("good day, lady.");
        } else if ("f".equals(sex) && "t".equals(day)) {
            System.out.println("good afternoon, lady.");
        } else if ("f".equals(sex) && "m".equals(day)) {
            System.out.println("good night, lady.");
        } else {
            System.out.println("Incorrect answer");
        }
    }

    private static void p6() {

    }

    private static void p7() {
        System.out.print("Base? ");
        int b = keyboard.nextInt();
        System.out.print("Height? ");
        int h = keyboard.nextInt();
        System.out.println("");
        int area = (b * h) / 2;
        int per = b * 3;
        System.out.println("The aria is " + area);
        System.out.println("The perimeter is " + per);
    }

    private static void p8() {
        System.out.print("Circumference radius? ");
        float r = keyboard.nextFloat();
        float per = (float) (2 * 3.1416 * r);
        float area = (float) (3.1416 * Math.pow(r, 2));
        float vol = (float) (4 * 3.1416 * Math.pow(r, 3) / 3);
        System.out.println("");
        System.out.println("Perimeter= " + per);
        System.out.println("Area= " + area);
        System.out.println("Volume= " + vol);
    }

    private static void p9() {
        System.out.print("Days? ");
        int D = keyboard.nextInt();
        System.out.print("Hours? ");
        int H = keyboard.nextInt();
        System.out.print("Minutes? ");
        int Min = keyboard.nextInt();
        System.out.print("Seconds? ");
        int Sec = keyboard.nextInt();
        System.out.println("");
        int dSec = D * 86400;
        int hSec = H * 3600;
        int mSec = Min * 60;
        int totalSec = dSec + hSec + mSec + Sec;
        System.out.println("Total seconds = " + totalSec);
    }

    private static void p10() {
        System.out.print("Number 1? ");
        int n1 = keyboard.nextInt();
        System.out.print("Number 2? ");
        int n2 = keyboard.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {

            } else {
                System.out.print(i + " ");
            }
        }

    }

    private static void p11() {
        System.out.print("Number 1: ");
        int n1 = keyboard.nextInt();
        System.out.print("Number 2: ");
        int n2 = keyboard.nextInt();
        System.out.print("Number 3: ");
        int n3 = keyboard.nextInt();
        System.out.println("");
        if (n1 > n2 && n1 > n3 && n2 > n3) {
            System.out.println(n3 + " " + n2 + " " + n1);
        } else if (n1 > n2 && n1 > n3 && n3 > n2) {
            System.out.println(n2 + "\t" + n3 + "\t" + n1);
        } else if (n2 > n1 && n2 > n3 && n1 > n3) {
            System.out.println(n3 + "\t" + n1 + "\t" + n2);
        } else if (n2 > n1 && n2 > n3 && n3 > n1) {
            System.out.println(n1 + "\t" + n3 + "\t" + n2);
        } else if (n3 > n1 && n3 > n2 && n1 > n2) {
            System.out.println(n2 + "\t" + n1 + "\t" + n3);
        } else if (n3 > n1 && n3 > n2 && n2 > n1) {
            System.out.println(n1 + "\t" + n2 + "\t" + n3);
        }

    }

    private static void p12() {
        //repetido
    }

    private static void p13() {
        System.out.println("n1");
        int a = keyboard.nextInt();
        System.out.println("n2");
        int b = keyboard.nextInt();
        System.out.println("n3");
        int c = keyboard.nextInt();
        //int eq=a * x * 2
    }

    private static void p14() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p15() {
        System.out.println("");
        System.out.println("***** Option 15 *****");
        System.out.println("");
        System.out.print("Number 1: ");
        int n1 = keyboard.nextInt();
        System.out.print("Number 2: ");
        int n2 = keyboard.nextInt();
        System.out.print("Number 3: ");
        int n3 = keyboard.nextInt();
        System.out.print("Number 4: ");
        int n4 = keyboard.nextInt();
        System.out.println("");
        float m = (n1 + n2 + n3 + n4) / 4;
        System.out.println("Average= " + m);
        System.out.println("");
    }

    private static void p16() {
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            n[i] = keyboard.nextInt();
        }
        System.out.println("");
        float m = (n[0] + n[1] + n[2] + n[3] + n[4] + n[5] + n[6] + n[7]
                + n[8] + n[9]) / 10;
        System.out.println("Average= " + m);
        System.out.println("");
    }

    private static void p17() {
        for (int i = 0; i < 57; i++) {
            System.out.print((i + 1) + " ");
        }
    }

    private static void p18() {
        for (int i = 57; i > 0; i--) {
            System.out.println(i + "\t");
        }
    }

    private static void p19() {
        System.out.println("Number?: ");
        int n = keyboard.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t");
        }
    }

    private static void p20() {
        int i = 0;
        while (i < 57) {
            System.out.println(i + 1);
            i = i + 1;
        }
    }

    private static void p21() {
        int i = 57;
        while (i > 0) {
            System.out.println(i - 1);
            i = i - 1;
        }
    }

    private static void p22() {
        System.out.println("Number?: ");
        int n = keyboard.nextInt();
        int i = 0;
        while (i < n) {
            System.out.println(i + 1 + "\t");
            i = i + 1;
        }
    }

    private static void p23() {
        int i = 0;
        do {
            System.out.println(i + 1 + "\t");
            i = i + 1;
        } while (i < 57);
    }

    private static void p24() {
        System.out.println("Number one?: ");
        int n1 = keyboard.nextInt();
        System.out.println("Number two?: ");
        int n2 = keyboard.nextInt();
        if (n1 > n2) {
            do {
                System.out.println(n2 + 1 + "\t");
                n2 = n2 + 1;
            } while (n1 > n2);
        } else {
            do {
                System.out.println(n1 + 1 + "\t");
                n1 = n1 + 1;
            } while (n2 > n1);
        }
    }

    private static void p25() {
        System.out.println("Name?: ");
        String name = keyboard.next();
        System.out.println("First surname?: ");
        String surname1 = keyboard.next();
        System.out.println("Second surname?: ");
        String surname2 = keyboard.next();
        System.out.println("DNI?: ");
        String dni = keyboard.next();
        System.out.println("PAS?: ");
        float pas = keyboard.nextFloat();
        System.out.println("PAD?: ");
        float pad = keyboard.nextFloat();
        
        if (pas > 120 || pad > 80) {
            System.out.println("The patient " + surname1 + " " + surname2 + ", " + name + " have have hypertension");
        }
        else if (pas < 55 || pad < 55){            
            System.out.println("The patient " + surname1 + " " + surname2 + ", " + name + " have have hypotension");
        }
        else if (pas > 84 && pas <120  || pad > 55 && pad <80) {
            System.out.println("The patient " + surname1 + " " + surname2 + ", " + name + " have normal blood pressure");
        }                 
    }

    private static void userMenu() {
        System.out.println();
        System.out.println("Opción 1- (--)");
        System.out.println("Opción 2- (--)");
        System.out.println("Opción 3-(--)");
        System.out.println("Opción 4-(--)");
        System.out.println("Opción 5- (--)");
        System.out.println("Opción 6- (--):");
        System.out.println("Opción 7- (--):");
        System.out.println("Opción 8- (--)):");
        System.out.println("Opción 9- (--):");
        System.out.println("Opción 10- (--):");
        System.out.println("Opción 11- (--):");
        System.out.println("Opción 12- (--):");
        System.out.println("Opción 13- (--):");
        System.out.println("Opción 14- (--):");
        System.out.println("Opción 15- (--):");
        System.out.println("Opción 16- (--):");
        System.out.println("Opción 17- (--):");
        System.out.println("Opción 18- (--):");
        System.out.println("Opción 19- (--):");
        System.out.println("Opción 20- (--):");
        System.out.println("Opción 21- (--):");
        System.out.println("Opción 22- (--):");
        System.out.println("Opción 23- (--):");
        System.out.println("Opción 24- (--):");
        System.out.println("Opción 25- (--):");
        System.out.print("\nOpcion ?: ");
    }
}
