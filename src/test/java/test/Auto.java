package test;
public class Auto{
    static String cantidadCreados;
    String modelo, marca;
    int precio, registro;
    Motor motor;
    Asiento[] asientos;

    int cantidadAsientos(){
        int contador = 0;
        for (int i = 0; i<asientos.length;i++){
            if (asientos[i] == null){
                continue;
            }
            if (asientos[i] instanceof Asiento){
                contador++;
            }
        }
        return contador;
    }

    String verificarIntegridad(){
        if (registro != motor.registro){
            return "Las piezas no son originales";
        }
        for (int i=0; i<asientos.length;i++){
            if (asientos[i] != null){
                if (asientos[i].registro != registro){
                    return "Las piezas no son originales";
                }
            }
        }
        return "Auto original";
    }
}