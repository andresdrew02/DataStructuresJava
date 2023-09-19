package estructuras;

import clases.Trabajo;

public interface ColaProceso {
    void encolar(Trabajo t);
    void eliminar();
    Trabajo obtener();

    int longitud();
}
