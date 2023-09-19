package estructuras;

import clases.Libro;

public class Lista {

    private int longitud = 0;

    private Nodo cabeza = null;
    private class Nodo {
        public Libro libro;
        public Nodo siguiente = null;

        public Nodo(Libro libro) {
            this.libro = libro;
        }
    }

    public void insertarPrincipio(Libro libro){
        Nodo nodo = new Nodo(libro);
        nodo.siguiente = cabeza;
        cabeza = nodo;
        longitud++;
    }

    public void insertarFinal(Libro libro){
        Nodo nodo = new Nodo(libro);
        Nodo puntero = cabeza;
        while (puntero.siguiente != null){
            puntero = puntero.siguiente;
        }
        puntero.siguiente = nodo;
        longitud++;
    }

    public void insertarDespues(int n, Libro libro){
        Nodo nodo = new Nodo(libro);
        if (cabeza == null){
            cabeza = nodo;
        }else{
            Nodo puntero = cabeza;
            int contador = 0;
            while (contador < n && puntero.siguiente != null){
                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        longitud++;
    }

    public Libro obtener (int n){
        if (cabeza == null){
            return null;
        }
        Nodo puntero = cabeza;
        int contador = 0;
        while (contador < n && puntero.siguiente != null){
            puntero = puntero.siguiente;
            contador++;
        }
        if (contador != n){
            return null;
        }
        return puntero.libro;
    }

    public int contar(){
        return longitud;
    }

    public void eliminarPrimero(){
        if (cabeza == null){
            return;
        }
        Nodo primerElemento = cabeza;
        cabeza = cabeza.siguiente;
        primerElemento.siguiente = null;
        longitud--;
    }

    public boolean estaVacia(){
        return cabeza == null;
    }

    public void eliminarUltimo(){
        if (cabeza !=null){
            if (cabeza.siguiente == null){
                cabeza = null;
                longitud--;
            }else{
                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null){
                    puntero = puntero.siguiente;
                }
                puntero.siguiente = null;
                longitud--;
            }
        }
    }

    public void eliminarLibro(int n){
        if (cabeza == null){
            return;
        }

        if (n == 0){
            eliminarPrimero();
            return;
        }

        if (n > longitud){
            return;
        }

        Nodo puntero = cabeza;
        int contador = 0;
        while (contador < n-1 && puntero.siguiente != null){
            puntero = puntero.siguiente;
            contador++;
        }
        Nodo temporal = puntero.siguiente;
        puntero.siguiente = temporal.siguiente;
        temporal.siguiente = null;
        longitud--;
    }
}
