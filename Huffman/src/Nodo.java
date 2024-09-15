package ColaPrioridad;


public  class Nodo{
    String letra;
    int frecuencia;
    String codigo;
    Nodo hijoIzq;
    Nodo hijoDer;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCodigo() {return codigo;}
    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setHijoDer(Nodo hijoDer) {
        this.hijoDer = hijoDer;
    }

    public void setHijoIzq(Nodo hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public Nodo getHijoDer() {
        return hijoDer;
    }

    public Nodo getHijoIzq() {
        return hijoIzq;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public String getLetra() {
        return letra;
    }
}
