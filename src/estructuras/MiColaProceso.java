package estructuras;

import clases.Trabajo;

public class MiColaProceso implements ColaProceso {

    private class NodoProceso{
        public Trabajo trabajo;

        public NodoProceso siguiente;

        public NodoProceso(Trabajo trabajo){
            this.trabajo = trabajo;
        }
    }

    private NodoProceso cabeza,ultimo;
    private int longitud;

    @Override
    public void encolar(Trabajo t) {
        NodoProceso nuevoNodo = new NodoProceso(t);
        if (cabeza == null){
            cabeza = nuevoNodo;
        }else{
            ultimo.siguiente = nuevoNodo;
        }
        ultimo = nuevoNodo;
        longitud++;
    }

    @Override
    public void eliminar() {
        if (cabeza == null){
            return;
        }
        NodoProceso eliminar = cabeza;
        cabeza = cabeza.siguiente;
        eliminar.siguiente = null;
        if (cabeza == null){
            ultimo = null;
        }
        longitud--;
    }

    @Override
    public Trabajo obtener() {
        if (cabeza == null){
            return null;
        }
        return cabeza.trabajo;
    }

    @Override
    public int longitud(){
        return longitud;
    }
}
