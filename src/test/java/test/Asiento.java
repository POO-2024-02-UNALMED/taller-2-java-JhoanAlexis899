package test;
public class Asiento{
    String color;
    int precio, registro;

    void cambiarColor(String color){
        String[] colores = {"rojo" , "verde", "amarillo", "negro", "blanco"};
        for (int i = 0; i<colores.length;i++){
            if (colores[i].equals(color)){
                this.color = color;
                break;
            }
        }
    }
}