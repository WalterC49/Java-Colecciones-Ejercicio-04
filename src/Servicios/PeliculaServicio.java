/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Walter
 */
public class PeliculaServicio {
    ArrayList<Pelicula> Peliculas = new ArrayList();
    
    public void cargarPeliculas(Pelicula peli){
        Peliculas.add(peli);
    }
    
    public void MostrarPeliculas(){
        System.out.println("Mostrando todas las peliculas:");
        for(Pelicula i: Peliculas){
            System.out.println(i);
        }
    }
    
    public void MostrarPeliculasMax1HR(){
        System.out.println("\nMostrando todas las peliculas con duración mayor a 1 hora:");
        for(Pelicula i: Peliculas){
            if(i.getDuracion()>1){
                System.out.println(i);
            }
        }
    }
    
    public void MostrarPeliculasPorDuracionAsc(){
        Collections.sort(Peliculas, Comparadores.ordenarPorDuracionAsc);
        System.out.println("\nMostrando las peliculas ordenadas por su duración de mayor a menor:");
        for(Pelicula i: Peliculas){
            System.out.println(i);
        }
    }
    
    public void MostrarPeliculasPorDuracionDesc(){
        Collections.sort(Peliculas, Comparadores.ordenarPorDuracionDesc);
        System.out.println("\nMostrando las peliculas ordenadas por su duracion de menor a mayor:");
        for(Pelicula i: Peliculas){
            System.out.println(i);
        }
    }
    
    public void MostrarPeliculasPorTituloAsc(){
        Collections.sort(Peliculas, Comparadores.ordenarPorTituloDesc);
        System.out.println("\nMostrando las peliculas ordenas por su titulo alfabéticamente:");
        for(Pelicula i: Peliculas){
            System.out.println(i);
        }
    }
    
    public void MostrarPeliculasPorDirectorAsc(){
        Collections.sort(Peliculas, Comparadores.ordenarPorDirectorDesc);
        System.out.println("\nMostrando las peliculas ordenadas por su director alfabéticamente:");
        for(Pelicula i: Peliculas){
            System.out.println(i);
        }
    }
    
}
