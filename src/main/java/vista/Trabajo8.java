/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package vista;

/**
 *
 * @author Andres Ochoa
 */
public class Trabajo8 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        var ventana1 = new VentanaProfesor();
        var ventana2 = new VentanaAsignatura();
        var ventana3 = new VentanaGrupo();
        
        
        ventana1.setVisible(true);
        ventana2.setVisible(true);
        ventana3.setVisible(true);
    }
}
