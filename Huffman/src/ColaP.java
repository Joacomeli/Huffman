package ColaPrioridad;

public class ColaP {

    Nodo[] elementos;
    int indice;

    public void InicializarCola() {
        elementos = new Nodo[100];
        indice = 0;
    }

    public Nodo PrimerNodo(){

        return elementos[indice-1];
    }

    public int Prioridad() {
        return elementos[indice-1].frecuencia;
    }

    public boolean ColaVacia() {
        return (indice == 0);
    }

    public String Primero() {
        return elementos[indice-1].letra;
    }

    public int tamanioCola(){
        return indice;
    }

    public void Desacolar() {
        indice--;
    }

    public void Acolar(Nodo a) {
        int j = indice;
        while (j > 0 && elementos[j-1].frecuencia < a.frecuencia){
            elementos[j] = elementos[j-1];
            j--;
        }
        elementos[j] = a;
        indice++;

    }
}