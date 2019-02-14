/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_singleton;

/**
 *
 * @author lvazquezdorna
 */
public class OtroSingleton {

    private String nombre;
    private int edad;

    private OtroSingleton() {
    }

    private static class SingletonHolder {

        private static final OtroSingleton INSTANCE = new OtroSingleton();
    }

    public static OtroSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "OtroSingleton{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }

    
    
}
