/*
5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicioCinco;

import java.util.Locale;
import java.util.Scanner;

 
public class Cuenta {
    
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public Cuenta() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return dni;
    }

    public void setDNI(long DNI) {
        this.dni = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void crearCuenta(){
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese su número de cuenta: ");
        this.numeroCuenta = scan.nextInt();
        System.out.println("Ingrese su Dni: ");
        this.dni = scan.nextLong();
    }
    
    public void ingresar(double ingreso){
       this.saldoActual += ingreso;
    }
    public double retirar(double retiro){
        if (this.saldoActual>=retiro) {
            return  this.saldoActual -= retiro ;
        }else{
            return this.saldoActual=0;
        }
    }
    public double extraccionRapida(double retiro){
        if (retiro<(this.saldoActual*0.2)) {
            this.saldoActual -= retiro;
            System.out.println("Usted retiro: "+retiro+",y su saldo actual es: " + this.saldoActual);
            return this.saldoActual; 
        }else{
            System.out.println("Ha excedido el límite del día.");
            return retiro;
        }
    }
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de: " + saldoActual);
    }
    public void consultarDatos(){
        System.out.println("Su número de cuenta es: " + numeroCuenta);
        System.out.println("Su DNI es: " + dni);
    }
    public void menu(){
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opcion;

        do {
            System.out.println();
            System.out.println("Ingrese que desea hacer en su cuenta.");
            System.out.println();
            System.out.println("1.  Ingresar dinero a la cuenta.");
            System.out.println("2.  Retirar dinero de la cuenta.");
            System.out.println("3.  Retire una extración rápida del dinero de su cuenta.");
            System.out.println("4.  Consultar su saldo actual.");
            System.out.println("5.  Consultar sus datos.");
            System.out.println("6.  Salir.");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escriba el monto a ingresar: ");
                    long monto = scan.nextLong();
                        ingresar(monto);
                    break;
                case 2:
                    System.out.println("Escriba el monto a retirar: ");
                    long sacar = scan.nextLong();
                        retirar(sacar);
                    break;
                case 3:
                    System.out.println("Escriba el monto a extraer: ");
                    long extraccion = scan.nextLong();
                        extraccionRapida(extraccion);
                    break;
                case 4:
                        consultarSaldo();
                    break;
                case 5:
                       consultarDatos();
                    break;

            }
        } while (opcion != 6);
    }
   
}
