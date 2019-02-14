/*
 * Ejemplo de utilización del sigleton:
en el main recoge singleton y lo utiliza, asigna valores y muestralos
 */
package cod_singleton;

import utilidades.PedirDatos;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class COD_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Singleton primero = Singleton.getInstance();
        Singleton segundo = Singleton.getInstance();

        primero.setNombre(PedirDatos.cadena("Nombre: "));
        primero.setEdad(PedirDatos.entero("Edad: "));

        System.out.println(primero.toString());

        segundo.setNombre(PedirDatos.cadena("Nombre: "));
        segundo.setEdad(PedirDatos.entero("Edad: "));

        System.out.println(segundo.toString());
        System.out.println(primero.toString());
    }

}
