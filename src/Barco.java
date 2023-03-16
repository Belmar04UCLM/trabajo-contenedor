public class Barco {
    public static final int FILAS = 10;
    public static final int COLUMNAS = 12;
    Contenedor[][] contenedor = new Contenedor[FILAS][COLUMNAS];
    //Creamos el constructor para vaciar los contenedores

    public String toString() {
        StringBuilder m = new StringBuilder();
        for (int f = 0; f < FILAS; f++) {
            for (int c = 0; c < COLUMNAS; c++) {
                if(contenedor[f][c].getId_contenedor()==-1){
                    m.append("O ");
                }
                else{
                    m.append("L ");
                }
            }
            m.append("\n");
        }
        return m.toString();
    }
}