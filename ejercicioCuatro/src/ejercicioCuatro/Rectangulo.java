/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicioCuatro;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la base y la altura del rectangulo: ");
        this.base = scan.nextDouble();
        this.altura = scan.nextDouble();
    }

    public double calPerimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

    public double calSuperficie() {
        double superficie = base * altura;
        return superficie;
    }
    
    public void mostrar(){
        System.out.println("El calculo de la superficie es: " + calSuperficie());
        System.out.println("El calculo del perimetro del rectangulo es " + calPerimetro());
    }

    public void Paint() {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= base; j++) {
                if ((i == 1) || (i == altura) || (j == 1) || (j == base)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
