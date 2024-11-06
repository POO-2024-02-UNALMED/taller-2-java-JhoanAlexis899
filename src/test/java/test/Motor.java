package test;
public class Motor{
    int numeroCilindros, registro;
    String tipo;
    void cambiarRegistro(int numero){
        this.registro = numero;
    }
    void asignarTipo(String tipo){
        if (tipo.equals("electrico") || tipo.equals("gasolina")){
            this.tipo = tipo;
        }
    }
}