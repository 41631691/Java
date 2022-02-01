package ejercicioTrhee;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private double num1;
    private double num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el primer número: ");
        this.num1 = scan.nextDouble();
        System.out.println("Ingrese el segundo número: ");
        this.num2 = scan.nextDouble();
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicacion() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error, hay un 0");
            return 0;
        } else {
            return num1 * num2;
        }
    }

    public double division() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error, hay un 0");
            return 0;
        } else {
            return num1 / num2;
        }
    }

}
