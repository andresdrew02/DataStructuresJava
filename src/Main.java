import clases.*;
import estructuras.Lista;
import estructuras.MiColaProceso;

import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        //probarEstructuraLista();
        probarEstructuraCola();
    }

    private static void probarEstructuraLista(){
        //Inserciones + obtener
        Lista lista = new Lista();
        Libro libro1 = new Libro("Título del libro 1", "Autor del libro 1", "ISBN del libro 1");
        Libro libro2 = new Libro("Título del libro 2", "Autor del libro 2", "ISBN del libro 2");
        Libro libro3 = new Libro("Título del libro 3", "Autor del libro 3", "ISBN del libro 3");
        Libro libro4 = new Libro("Título del libro 4", "Autor del libro 4", "ISBN del libro 4");
        Libro libro5 = new Libro("Título del libro 5", "Autor del libro 5", "ISBN del libro 5");
        lista.insertarPrincipio(libro1);
        lista.insertarFinal(libro2);
        lista.insertarFinal(libro3);
        lista.insertarFinal(libro4);
        lista.insertarFinal(libro5);

        System.out.println("La lista contiene " + lista.contar() + " libros");
        System.out.println("Resultado de lista está vacía: " + lista.estaVacia());
        System.out.println("El tercer libro es: " + lista.obtener(2).toString());

        Libro libro6 = new Libro("Título del libro 6", "Autor del libro 6", "ISBN del libro 6");
        System.out.println("El cuarto libro antes de la inserción es: " + lista.obtener(3).toString());
        lista.insertarDespues(2, libro6);
        System.out.println("El cuarto libro despues de la inserción es: " + lista.obtener(3).toString());

        Libro libro7 = new Libro("Título del libro 7", "Autor del libro 7", "ISBN del libro 7");
        lista.insertarFinal(libro7);
        System.out.println("El último libro es: " + lista.obtener(lista.contar()-1).toString());

        //Eliminar
        System.out.println("El primer libro antes de eliminar es: " + lista.obtener(0).toString());
        lista.eliminarPrimero();
        System.out.println("El primer libro despues de eliminar es: " + lista.obtener(0).toString());

        System.out.println("El tercer libro antes de eliminar es: " + lista.obtener(2).toString());
        lista.eliminarLibro(2);
        System.out.println("El tercer libro despues de eliminar es: " + lista.obtener(3).toString());

        System.out.println("El último libro antes de eliminar es: " + lista.obtener(lista.contar()-1).toString());
        lista.eliminarUltimo();
        System.out.println("El último libro despues de eliminar es: " + lista.obtener(lista.contar()-1).toString());
    }
    private static void probarEstructuraCola(){
        Trabajo trabajo1 = new Trabajo("Título del trabajo 1", "Autor del trabajo 1");
        Trabajo trabajo2 = new Trabajo("Título del trabajo 2", "Autor del trabajo 2");
        Trabajo trabajo3 = new Trabajo("Título del trabajo 3", "Autor del trabajo 3");
        Trabajo trabajo4 = new Trabajo("Título del trabajo 4", "Autor del trabajo 4");
        Trabajo trabajo5 = new Trabajo("Título del trabajo 5", "Autor del trabajo 5");

        MiColaProceso cola = new MiColaProceso();

        System.out.println("La cola contiene " + cola.longitud() + " trabajos");
        cola.encolar(trabajo1);
        cola.encolar(trabajo2);
        cola.encolar(trabajo3);
        cola.encolar(trabajo4);
        cola.encolar(trabajo5);
        System.out.println("La cola contiene " + cola.longitud() + " trabajos");

        System.out.println("El trabajo a procesar es: " + cola.obtener().toString());
        cola.eliminar();
        System.out.println("La cola contiene " + cola.longitud() + " trabajos");
        System.out.println("El trabajo a procesar es: " + cola.obtener().toString());
    }
}