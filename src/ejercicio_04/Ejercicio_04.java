/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para
esto, tendremos una clase Pelicula con el titulo, director y duración de la película (en
horas). Implemente las clases y métodos necesarios para esta situación, teniendo en
cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si
quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
package ejercicio_04;

import Entidades.Pelicula;
import Servicios.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author Walter
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa guarda peliculas y sus datos en una lista y luego muestra la lista.");
        Pelicula peli = new Pelicula();
        PeliculaServicio peliS = new PeliculaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        boolean continuar=false;
        String titulo;
        String director;
        Double duracion;
        
        do{
            System.out.print("Ingrese el titulo de una pelicula: ");
            titulo=leer.nextLine();
            System.out.print("Ingrese a su director: ");
            director=leer.nextLine();
            System.out.print("Ingrese su duración en horas: ");
            duracion=leer.nextDouble();
            
            peliS.cargarPeliculas(new Pelicula(titulo, director, duracion));
            
            do{
                System.out.print("\n¿Desea agregar otra pelicula?(s/n) ");
                respuesta = leer.next().toLowerCase();
                switch(respuesta){
                    case "s":
                        continuar=true;
                        break;
                    case "n":
                        continuar=false;
                        break;
                    default:
                        System.out.println("Opción no valida");
                }
            }while(!(respuesta.equals("s")||respuesta.equals("n")));
            leer.nextLine();
        }while(continuar==true);
        
        System.out.println("-------------------------------------------------");
        peliS.MostrarPeliculas();
        peliS.MostrarPeliculasMax1HR();
        peliS.MostrarPeliculasPorDuracionAsc();
        peliS.MostrarPeliculasPorDuracionDesc();
        peliS.MostrarPeliculasPorTituloAsc();
        peliS.MostrarPeliculasPorDirectorAsc();
    }
    
}
