public class Contenedor{
    private int id_contenedor=-1;
    private int peso;
    private String país;
    private boolean inspeccionado;
    private int prioridad;
    private String contenido;
    private String empresa_envía;
    private String getEmpresa_recibe;
    //Declaramos setters y getters
    public int getId_contenedor() {
        return id_contenedor;
    }
    public int getPeso() {
        return peso;
    }
    public String getPaís() {
        return país;
    }
    public boolean getinspeccionado(){
        return inspeccionado;
    }
    public int getPrioridad() {
        return prioridad;
    }
    public String getContenido() {
        return contenido;
    }
    public String getEmpresa_envía() {
        return empresa_envía;
    }
    public String getGetEmpresa_recibe() {
        return getEmpresa_recibe;
    }
    public void setId_contenedor(int id_contenedor) {
        this.id_contenedor = id_contenedor;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setPaís(String país) {
        this.país = país;
    }
    public void setInspeccionado(boolean inspeccionado) {
        this.inspeccionado = inspeccionado;
    }
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void setEmpresa_envía(String empresa_envía) {
        this.empresa_envía = empresa_envía;
    }
    public void setGetEmpresa_recibe(String getEmpresa_recibe) {
        this.getEmpresa_recibe = getEmpresa_recibe;
    }
}