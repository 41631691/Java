/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package ejercicioSeis;

import java.util.Locale;
import java.util.Scanner;

public class Cafetera {
    
    private long  capacidadMaxima;
    private long cantidadActual;

    public Cafetera(long capacidadMaxima, long cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {
    }

    public long getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(long capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public long getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(long cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("Cafetera llena.");
    }
    public void servirTaza(int taza){
        if (taza<this.cantidadActual) {
            this.cantidadActual -= taza;
            System.out.println("TAZA LLENA");
        }else{
            long disponible = this.cantidadActual;
            this.cantidadActual=0;
            System.out.println("Cafe acabado, se han servido "+disponible+ "ml");
        }
        
    }
    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }
    public long agregarCafe(long agregar){
        Scanner scan = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        
        System.out.println("Ingrese la cantidad de café: ");
        agregar = scan.nextLong();
        return this.cantidadActual += agregar;
    }
}
